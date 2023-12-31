package com.example.tinqin.zoostore.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.tinqin.zoostore")
@ComponentScan(basePackages = "com.example.tinqin.zoostore.API.operation")
@EntityScan(basePackages = "com.example.tinqin.zoostore.persistence.entity")
@EnableJpaRepositories(basePackages = "com.example.tinqin.zoostore")
@EnableFeignClients
public class ZooStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZooStoreApplication.class, args);
    }

}
