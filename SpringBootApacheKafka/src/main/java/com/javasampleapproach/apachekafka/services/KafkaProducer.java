package com.javasampleapproach.apachekafka.services;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value("${jsa.kafka.topic}")
	String kafkaTopic = "jsa-test";
	
	public void send(String data) {
		log.info("sending data='{}'", data);
		long startTime = System.nanoTime();
		log.info("start-time='{}'", startTime);
		System.out.println("start-time "+startTime );
		
		for(int x=0;x<10000;x++) {
		    kafkaTemplate.send(kafkaTopic, data+x);
		    //kafkaTemplate.send(MessageBuilder.withPayload(data).build());
		}
		long endTime = System.nanoTime();
		log.info("end-time='{}'", endTime);
		System.out.println("end-time "+ endTime );
		
		long estimatedTime = endTime - startTime;
		System.out.println("estimated-time "+estimatedTime );
		log.info("estimated-time='{}'", estimatedTime);
		
	}
}
