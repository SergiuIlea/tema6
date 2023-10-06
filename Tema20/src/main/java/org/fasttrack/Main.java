package org.fasttrack;


import org.fasttrack.model.Transaction;
import org.fasttrack.model.Type;
import org.fasttrack.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner fromTheStart(TransactionRepository repository){
        return args -> {
            Transaction t1 = new Transaction(1, "telefon", Type.BUY, 1);
            Transaction t2 = new Transaction(2, "laptop", Type.BUY, 2);
            Transaction t3 = new Transaction(3, "3D printer", Type.SELL, 1);
            Transaction t4 = new Transaction(4, "TV", Type.BUY, 5);
            Transaction t5 = new Transaction(5, "tableta", Type.SELL, 3);
            repository.save(t1);
            repository.save(t2);
            repository.save(t3);
            repository.save(t4);
            repository.save(t5);
        };
    }
}
