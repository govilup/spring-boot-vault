# spring-boot-vault
Spring Boot Vault Demo Application

## Installation
### Install and Launch HashiCorp Vault

If you are using a Mac with homebrew
```bash
$ brew install vault
```
Alternatively, download Vault for your operating system from [official website](https://www.vaultproject.io/downloads.html)

After you install Vault, launch it in a console window using below command
```bash
$ vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"
```
```bash
The command above starts Vault in development mode using in-memory storage without transport encryption. 
```

### Store configuration in Vault

Launch another console window to store application configuration in Vault using the Vault command line.
```bash
$ export export VAULT_TOKEN=12345
$ export VAULT_ADDR="http://127.0.0.1:8200"
```
Now you can store a configuration key-value pairs inside Vault:
```bash
$ vault kv put secret/spring-vault-demo demo.username=demouser demo.password=demopassword
```

## Run the Spring-boot application
### Build Project with Maven
```bash
$ mvn clean install
```
### Run app with java -jar command
```bash
$ java -jar target/vault-demo-0.0.1-SNAPSHOT.jar
```

or just run application using Spring Boot maven command which uses maven plugin
```bash
$ mvn spring-boot:run
```

## Import and Run using Eclipse or STS

Run application as Spring boot app or simply run as java application.
