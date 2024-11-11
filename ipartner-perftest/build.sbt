// enablePlugins(GatlingPlugin)



// libraryDependencies += "io.gatling" % "gatling-test-framework" % "3.9.5" % Test
// libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.9.5" % Test

// enablePlugins(GatlingPlugin)
// ThisBuild / scalaVersion := "2.13.12"
// libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.9.5" % "test"
// libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "3.9.5" % "test"

enablePlugins(GatlingPlugin)
ThisBuild / sbtVersion := "1.10.5"   // ใช้เวอร์ชันล่าสุดของ sbt
ThisBuild / scalaVersion := "2.13.12" // ใช้เวอร์ชันที่รองรับ
libraryDependencies += "io.gatling" % "gatling-test-framework" % "3.9.5" % Test
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.9.5" % Test
