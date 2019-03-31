package br.com.callbackapi.callbackapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CallbackapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallbackapiApplication.class, args);
	}

}
