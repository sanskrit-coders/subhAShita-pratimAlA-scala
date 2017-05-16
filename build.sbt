scalaVersion := "2.11.8"

enablePlugins(AndroidApp)
android.useSupportVectors

versionCode := Some(1)
version := "0.1"

instrumentTestRunner :=
  "android.support.test.runner.AndroidJUnitRunner"

platformTarget := "android-25"

javacOptions in Compile ++= "-source" :: "1.7" :: "-target" :: "1.7" :: Nil

proguardOptions ++= "-dontwarn com.sktutilities.transliteration.**" ::
  "-dontwarn groovy.lang.**" :: Nil

//useProguard := false

libraryDependencies ++=
  "com.android.support" % "appcompat-v7" % "25.3.1" ::
  "com.android.support.test" % "runner" % "0.5" % "androidTest" ::
  "com.android.support.test.espresso" % "espresso-core" % "2.2.2" % "androidTest" ::
  "com.github.sanskrit-coders" % "indic-transliteration" % "1.1" ::
  Nil

