package io.PersonalProject.Covid19TrackerProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19TrackerProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19TrackerProjApplication.class, args);
	}

}
