package com.riot.db;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;


@EnableJpaRepositories
@Transactional
@DataJpaTest
class DbApplicationTests {


	private String summonerName = "인간사냥꾼 김씨";
	@Test
	void contextLoads() {

	}


}
