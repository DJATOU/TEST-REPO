package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

        Plan plan = new Plan(1, 2, 3, 4);
        System.out.println("Équation du plan : " + plan);

        double x = 1;
        double y = 2;
        double z = -1;
        System.out.println("Le point (" + x + ", " + y + ", " + z + ") est sur le plan : " + plan.estSurPlan(x, y, z));

    }

}
