package com.vault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vault.model.SecretData;

@RestController
@SpringBootApplication
@EnableConfigurationProperties(SecretData.class)
public class VaultDemoApplication{

	private final SecretData data;

    public VaultDemoApplication(SecretData data) {
        this.data = data;
    }

	public static void main(String[] args) {
		SpringApplication.run(VaultDemoApplication.class, args);
	}
	
	@RequestMapping("/getInfo")
	public SecretData getInfo(){
		return data;
	}

}

