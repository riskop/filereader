package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Value("${client.keystore.certificates.signing.path}")
	String path;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello");
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		byte[] content = new byte[1000];
		fis.read(content);
		System.out.println("content: " + new String(content));
	}
}
