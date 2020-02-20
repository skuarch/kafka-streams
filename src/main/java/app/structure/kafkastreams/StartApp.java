package app.structure.kafkastreams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private KafkaConsumer kafkaConsumer;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("empezo");
    }
}
