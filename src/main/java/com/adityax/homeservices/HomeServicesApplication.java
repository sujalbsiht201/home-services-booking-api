package com.adityax.homeservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.adityax.homeservices.entity.HomeService;
import com.adityax.homeservices.repository.HomeServiceRepository;

@SpringBootApplication
public class HomeServicesApplication {
    public static void main(String[] args) { SpringApplication.run(HomeServicesApplication.class, args); }

    @Bean
    CommandLineRunner seedServices(HomeServiceRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.saveAll(java.util.List.of(
                    new HomeService("Home Cleaning", "Professional home cleaning service", 799.0, 4.6),
                    new HomeService("Plumbing", "Tap, pipe and bathroom repairs", 499.0, 4.5),
                    new HomeService("Electrician", "Electrical repair and installation", 399.0, 4.7),
                    new HomeService("AC Repair", "Air conditioner service and repair", 699.0, 4.4),
                    new HomeService("Painting", "Interior and exterior painting", 1999.0, 4.3),
                    new HomeService("Pest Control", "Home pest inspection and treatment", 999.0, 4.2),
                    new HomeService("Carpentry", "Furniture and woodwork repairs", 599.0, 4.5),
                    new HomeService("Appliance Repair", "Repair for common home appliances", 499.0, 4.1)
                ));
            }
        };
    }
}
