package com.riot.db;

import com.RiotAPIConnection;
import com.entity.Summoner;
import com.entity.match.Match;
import com.riot.db.entity.MatchEntity;
import com.riot.db.entity.SummonerEntity;
import com.riot.db.repository.ParticipantRepository;
import com.riot.db.repository.SummonerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootTest
@EnableJpaRepositories
class DbApplicationTests {

	private RiotAPIConnection api = new RiotAPIConnection("RGAPI-c39b76b7-c3c9-41ec-9812-e882b4c092f6");

	@Autowired
	private SummonerRepository summonerRepository;

	@Autowired
	private ParticipantRepository participantRepository;

	@Test
	void contextLoads() {
	}


	@Test
	@DisplayName("summoner 저장 후 조회하기")
	void t1() throws Exception {
		//given
		final Summoner summoner = api.getSummonerByName("인간사냥꾼김씨");
		//when
		SummonerEntity summonerEntity = new SummonerEntity(summoner);
		summonerRepository.save(summonerEntity);


	}
}
