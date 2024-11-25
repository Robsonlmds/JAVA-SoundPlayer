package com.example.soundPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.soundPlayer.principal.Principal;
import com.example.soundPlayer.repository.ArtistaRepository;

@SpringBootApplication
public class SoundPlayerApplication implements CommandLineRunner {
	@Autowired
	private ArtistaRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(SoundPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}