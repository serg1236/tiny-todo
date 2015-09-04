import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "todo"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      requireJs += "main.js"  
    )
    

}
