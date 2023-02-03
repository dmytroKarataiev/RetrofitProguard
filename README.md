# RetrofitProguard
A repo that shows how Retrofit Proguard rules do not keep interfaces that implement a base interface

## Related issue in the Retorift Repo
https://github.com/square/retrofit/issues/3539

## Steps to reproduce
Launch Release flavor - app crashes on Random and Random Animal button clicks with the following stack trace:
```
FATAL EXCEPTION: main
Process: com.example.retrofitproguard, PID: 12869
java.lang.IllegalArgumentException: HTTP method annotation is required (e.g., @GET, @POST, etc.).
    for method b.a
  at t3.g0.i(Unknown Source:46)
  at t3.d0.b(SourceFile:2786)
  at t3.c0.c(Unknown Source:24)
  at t3.c0$a.invoke(SourceFile:45)
  at java.lang.reflect.Proxy.invoke(Proxy.java:1006)
  at $Proxy2.a(Unknown Source)
  at com.example.retrofitproguard.MainActivity$a.j(SourceFile:29)
  at t2.a.e(Unknown Source:8)
  at f3.d0.run(Unknown Source:100)
  at f3.h0.J(SourceFile:37)
  at androidx.activity.j.m(SourceFile:181)
  at androidx.activity.j.i(SourceFile:138)
  at a1.d.onClick(SourceFile:33)
  at android.view.View.performClick(View.java:7792)
  at android.widget.TextView.performClick(TextView.java:16112)
  at com.google.android.material.button.MaterialButton.performClick(SourceFile:10)
  at android.view.View.performClickInternal(View.java:7769)
  at android.view.View.access$3800(View.java:910)
  at android.view.View$PerformClick.run(View.java:30218)
  at android.os.Handler.handleCallback(Handler.java:938)
  at android.os.Handler.dispatchMessage(Handler.java:99)
  at android.os.Looper.loopOnce(Looper.java:226)
  at android.os.Looper.loop(Looper.java:313)
  at android.app.ActivityThread.main(ActivityThread.java:8751)
  at java.lang.reflect.Method.invoke(Native Method)
  at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:571)
  at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1135)
  Suppressed: f3.b0: [c1{Cancelling}@739e386, Dispatchers.Main.immediate]
                                                                                                      ```
