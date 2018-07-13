# Microservice_communication
Message Driven Micro-services Using Spring Cloud Stream and Apache Kafka

Spring Cloud Stream is a framework for building message-driven microservice applications. Spring Cloud Stream builds upon Spring Boot to create standalone, production-grade Spring applications and uses Spring Integration to provide connectivity to message brokers. It provides opinionated configuration of middleware from several vendors, introducing the concepts of persistent publish-subscribe semantics, consumer groups, and partitions.

For more details follow the above included presentation.

How to start app:

1> start the kafka zookeeper on your host.
2> start the broker servers.
3> make necessary changes in the /src/main/resources/application.properties file to run on your brokers.
4> go to home folder (the one containing pom.xml file) in terminal and run "mvn clean package" to make the jar file using maven dependencies.
5> go to target folder in terminal, their will be a SpringBootApacheKafka.jar created ,to run it "java -jar SpringBootApacheKafka.jar --server.port=abcd" . Embeded tomcat server will run on port abcd.
6> For publishing a messge to topic: open a browser and type "localhost:abcd/home/producer?data=body" ,enter.
   This will publish a message "body" on the cteated topic(mentioned inside              src/main/java/com/javasampleapproach/apachekafka/services/KafkaProducer.java file).
7> To subscribe to any topic make the required changes in src/main/java/com/javasampleapproach/apachekafka/services/KafkaConsumer.java file. To see the messages open a browser and type "localhost:abcd/home/consumer" ,enter.
