package com.vault.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("demo")
public class SecretData {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SecretData [username=" + username + ", password=" + password + "]";
	}
}
