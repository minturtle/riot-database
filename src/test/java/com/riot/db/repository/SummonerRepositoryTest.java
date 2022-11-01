package com.riot.db.repository;

import com.entity.Summoner;
import com.riot.db.entity.SummonerEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class SummonerRepositoryTest {

    @Autowired
    private SummonerRepository summonerRepository;

    private SummonerEntity summonerEntity = new SummonerEntity(new Summoner("ac", 1, 1L, "name", "id", "puuid", 15L));

    @Test
    @DisplayName("summoner entity 저장 후 조회")
    void t1() throws Exception {
        //given
        summonerRepository.save(summonerEntity);
        //when
        final SummonerEntity findSummoner = summonerRepository.findByIdx(summonerEntity.getIdx());
        //then
        assertThat(findSummoner.getName()).isEqualTo("name");
    }
}