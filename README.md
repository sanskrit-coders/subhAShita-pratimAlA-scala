# Historical notes
* Initially started out with gradle project <https://github.com/sanskrit-coders/subhAShita-pratimAlA> and tried to import to scala, but failed.
* Switched to this project from scratch, following tutorials here: <https://github.com/scala-android/sbt-android> .
* Realized that one cannot import maven based modules (sanskritnlpjava and subhashita-db-sanskrit) in a sbt based project. [SO Question](http://stackoverflow.com/questions/38713822/intellij-idea-support-both-sbt-and-maven-on-a-single-project).
* Further faced problems with sbt heap size when including big sanskritnlpjava jar.
* Switched back to <https://github.com/sanskrit-coders/subhAShita-pratimAlA> .

# Initial setup
* Link /home/vvasuki/.android/sbt/sdk to android sdk folder.
* Just use the Build menu in Intellij to generate signed apk. If it fails, do packageRelease

## Quick sbt commands
* You may need to drop the `app/` below.
  * app/android:run
  * app/android:packageRelease
    * This uses credentials to keystore in local.properties, if available.
    * APK will go in target/android/output/


# Help links
* <https://github.com/scala-android/sbt-android>
* <http://scala-android.org/dependencies/>
* <https://gitter.im/scala-android/sbt-android>
* <http://scala-on-android.taig.io/publishing/>

