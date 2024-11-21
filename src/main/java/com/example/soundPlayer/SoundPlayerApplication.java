package com.example.soundPlayer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.soundPlayer.principal.Principal;

@SpringBootApplication
public class SoundPlayerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SoundPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}

}
