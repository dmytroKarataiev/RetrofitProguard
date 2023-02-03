package com.example.retrofitproguard

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.chucknorris.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val randomService: BaseRetrofitInterface =
            retrofit.create(RandomRetrofitInterface::class.java)
        findViewById<Button>(R.id.random).setOnClickListener {
            lifecycleScope.launchWhenResumed {
                val fact = randomService.fetchData().body()
                setJoke(fact)
            }
        }

        val randomAnimalService: BaseRetrofitInterface =
            retrofit.create(AnimalRetrofitInterface::class.java)
        findViewById<Button>(R.id.randomAnimal).setOnClickListener {
            lifecycleScope.launchWhenResumed {
                val fact = randomAnimalService.fetchData().body()
                setJoke(fact)
            }
        }

        val randomPoliticalRetrofitInterface =
            retrofit.create(PoliticalRetrofitInterface::class.java)
        findViewById<Button>(R.id.randomPolitics).setOnClickListener {
            lifecycleScope.launchWhenResumed {
                val fact = randomPoliticalRetrofitInterface.fetchData().body()
                setJoke(fact)
            }
        }

    }

    private fun setJoke(fact: Fact?) {
        findViewById<TextView>(R.id.joke).text =
            fact?.value ?: "Something went wrong (this is not a joke)"
    }

}