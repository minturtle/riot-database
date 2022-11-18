package com.riot.db;

import com.RiotAPIConnection;
import com.entity.Summoner;
import com.entity.match.Match;
import com.riot.db.entity.MatchEntity;
import com.riot.db.entity.SummonerEntity;
import com.riot.db.repository.MatchRepository;
import com.riot.db.repository.SummonerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest
@EnableJpaRepositories
@Transactional
class DbApplicationTests {

	private RiotAPIConnection api = new RiotAPIConnection("RGAPI-6acd8665-203a-4396-b57f-8092bbcbe54d");

	@Autowired
	private SummonerRepository summonerRepository;

	@Autowired
	private MatchRepository matchRepository;

	private String summonerName = "인간사냥꾼 김씨";
	@Test
	void contextLoads() {
	}


	@Test
	@DisplayName("summoner 저장 후 조회하기")
	void t1() throws Exception {
		//given
		Summoner summoner = api.getSummonerByName(summonerName);
		//when
		SummonerEntity summonerEntity = new SummonerEntity(summoner);

		summonerRepository.save(summonerEntity);
		final SummonerEntity findSummoner = summonerRepository.findByName(summonerName);

		assertThat(findSummoner.getPuuid()).isEqualTo(summoner.getPuuid());
	}

	@Test
	@DisplayName("매치정보 저장후 조회하기")
	void t2() throws Exception {
		//given
		Summoner summoner = api.getSummonerByName(summonerName);
		SummonerEntity summonerEntity = summonerRepository.save(new SummonerEntity(summoner));
		Match match = api.getMatchesBySummonerPUUID(summoner.getPuuid(), 0, 1).get(0);

		//when
		MatchEntity.MetaData metaData = new MatchEntity.MetaData(match.getMetadata());
		MatchEntity matchEntity = new MatchEntity(metaData, match.getInfo());

		matchRepository.save(matchEntity);
		//then
		final List<MatchEntity> findMatches = matchRepository.findMatchsByPuuid(summonerEntity.getPuuid());

		assertThat(findMatches.size()).isEqualTo(1);
	}
}
