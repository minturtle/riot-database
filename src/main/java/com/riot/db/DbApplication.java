package com.riot.db;

import com.RiotAPIConnection;
import com.entity.Summoner;
import com.entity.match.Match;
import com.riot.db.entity.MatchEntity;
import com.riot.db.entity.SummonerEntity;
import com.riot.db.repository.MatchRepository;
import com.riot.db.repository.SummonerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}
}
