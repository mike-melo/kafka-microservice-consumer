package com.rbc.cloud.hackathon.kafka.consumer.service;

import com.rbc.cloud.hackathon.data.Cities;
import com.rbc.cloud.hackathon.data.Customers;
import com.rbc.cloud.hackathon.data.Transactions;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Component
public class KafkaConsumer {
    private Logger logger= LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(id="TransactionsListener", topics="#{'${topic.name.transaction}'}", containerFactory = "ZeusListenerFactory")
    private void listenTransactions(final List<ConsumerRecord<String, Transactions>> messages, final Acknowledgment ack) throws IOException {
        PrintWriter writer = writerFor("transactions");

        logger.info("Received {} messages, iterating..", messages.size());
        for (ConsumerRecord<String, Transactions> record : messages) {
            String key=record.key();
            Transactions value=record.value();
            writer.append(value.toString() + '\n');
            writer.flush();
            ack.acknowledge();
            logger.info(" consumed TRANSACTIONS message : key[{}] = payload[{}]",key,value);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Done with this batch");
    }

    @KafkaListener(id="CitiesListener", topics="#{'${topic.name.cities}'}", containerFactory = "ZeusListenerFactory")
    private void listenCities(final List<ConsumerRecord<String, Cities>> messages, final Acknowledgment ack) throws IOException {
        PrintWriter writer = writerFor("cities");

        logger.info("Received {} messages, iterating..", messages.size());
        for (ConsumerRecord<String, Cities> record : messages) {
            String key=record.key();
            Cities value=record.value();
            writer.append(value.toString() + '\n');
            writer.flush();
            ack.acknowledge();
            logger.info(" consumed CITIES message : key[{}] = payload[{}]",key,value);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Done with this batch");
    }

    @KafkaListener(id="CustomersListener", topics="#{'${topic.name.customers}'}", containerFactory = "ZeusListenerFactory")
    private void listenCustomers(final List<ConsumerRecord<String, Customers>> messages, final Acknowledgment ack) throws IOException {
        PrintWriter writer = writerFor("customers");

        logger.info("Received {} messages, iterating..", messages.size());
        for (ConsumerRecord<String, Customers> record : messages) {
            String key=record.key();
            Customers value=record.value();
            writer.append(value.toString() + '\n');
            writer.flush();
            ack.acknowledge();
            logger.info(" consumed CUSTOMERS message : key[{}] = payload[{}]",key,value);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Done with this batch");
    }

    private PrintWriter writerFor(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        return out;
    }
}
