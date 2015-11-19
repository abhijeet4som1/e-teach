name := """I-Teach"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaCore,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "javax.inject" % "javax.inject" % "1",
  "mysql" % "mysql-connector-java" % "5.1.18",
  "javax.persistence" % "persistence-api" % "1.0.2",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.5.Final",
  "org.javassist" % "javassist" % "3.18.1-GA",
  "com.typesafe" % "config" % "1.2.1",
  "org.hibernate" % "hibernate-search-orm" % "4.5.1.Final",
  "org.hibernate" % "hibernate-search-analyzers" % "4.5.1.Final",
  "com.typesafe.play" %% "play-mailer" % "3.0.1"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
EclipseKeys.preTasks := Seq(compile in Compile)
// Java project. Don't expect Scala IDE
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
 // Use .class files instead of generated .scala files for views and routes
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)

fork in run := true
