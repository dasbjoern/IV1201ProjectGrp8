# IV1201ProjectGroup8
Use development branch.

#For developing on own machine

git clone https://github.com/dasbjoern/IV1201ProjectGroup8.git

cd IV1201ProjectGroup8

#with maven installed

mvn install

#use ' mvn clean install ' if there are any problems with building.

java -jar /target/iv1201projectgroup8-0.0.1-SNAPSHOT.jar

#version may differ.

#alternative

mvn compile

mvn package 

java -jar /target/iv1201projectgroup8-0.0.1-SNAPSHOT.jar

#Server will run on localhost:8080

#Can run with  
mvn spring-boot:run
