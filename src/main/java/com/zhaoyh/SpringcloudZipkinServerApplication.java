package com.zhaoyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class SpringcloudZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinServerApplication.class, args);
	}

}
