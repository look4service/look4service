look4service
============


Theme
=====
- Blue #00bad4
- [Color Wheel](http://paletton.com/#uid=13l0u0k++N5t-ZOL++V+WuC+6o4)
- [Android Action Bar Style Generator](http://jgilfelt.github.io/android-actionbarstylegenerator/#name=look4service&compat=appcompat&theme=light_dark&actionbarstyle=solid&texture=0&hairline=0&neutralPressed=1&backColor=00bad4%2C100&secondaryColor=008395%2C100&tabColor=fff%2C100&tertiaryColor=303030%2C100&accentColor=02e0ff%2C100&cabBackColor=002E3E%2C100&cabHighlightColor=02e0ff%2C100)

Generate Hash Key for Facebook use
--------------------------------------
Copy %HOMEPATH%\\.android\debug.keystore to Android folder. After the command it will prompt password (android) to continue.

```
$cd /c/Program Files/Java/jdk1.7.0_25/bin
$ ./keytool.exe -exportcert -alias androiddebugkey -keystore "C:\Program Files
(x86)\Android\debug.keystore" | openssl sha1 -binary | openssl base64
```

Reference
=======
- [Add Facebook login to your app](https://developers.facebook.com/docs/facebook-login/v2.2)