package app.structure.kafkastreams;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    // @KafkaListener(topics = "${kafka.topic.even-output}")
    public void consume(String string)  {
        System.out.println("consumer" + string);
    }

}