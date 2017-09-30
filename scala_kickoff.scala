#!/usr/bin/bash

echo "creating SBT project structure"
mkdir -p project
mkdir -p src/main/resources
mkdir -p src/main/scala 
mkdir -p src/main/java
# Test directories
mkdir -p src/test/resources
mkdir -p src/test/scala
mkdir -p src/test/java

touch build.sbt

echo "name := "AlloOla" 
version := "1.0" 
 
scalaVersion := "2.11.8" 
 
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" %  "test" 
    
" > build.sbt

echo "project structure created!"
