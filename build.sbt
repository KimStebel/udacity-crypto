name := "udacity-crypto"

version := "1.0"

scalaVersion := "2.10.0-M6"

resolvers ++= Seq(
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "sonatype groups public" at "https://oss.sonatype.org/content/groups/public/"
)

libraryDependencies ++= Seq(
  "com.chuusai" % "shapeless" % "1.2.3-SNAPSHOT" cross CrossVersion.full,
  "org.scalatest" % "scalatest_2.10.0-M6" % "1.9-2.10.0-M6-B2" % "test" 
)

libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-compiler" % _)

