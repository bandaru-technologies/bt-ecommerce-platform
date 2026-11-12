package com.bt.ecommerce.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BtServiceRegistryApplication {

  public static void main(String[] args) {
    SpringApplication.run(BtServiceRegistryApplication.class, args);
  }
}
