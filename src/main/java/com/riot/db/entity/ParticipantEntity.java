package com.riot.db.entity;


import javax.persistence.*;

@Entity
@Table(name="participant")
public class ParticipantEntity {


    @Id @GeneratedValue
    private long idx;

    @ManyToOne
    private TeamEntity team;

    @ManyToOne
    private SummonerEntity summoner;


    private Integer championId; //챔피언 객체로 바꾸어야함.
    private Integer assists;
    private Integer baronKills;
    private Integer bountyLevel;
    private Integer champExperience;
    private Integer champLevel;

    private String championName;
    private Integer damageDealtToBuildings;
    private Integer damageDealtToObjectives;
    private Integer damageDealtToTurrets;
    private Integer damageSelfMitigated;
    private Integer deaths;
    private Integer detectorWardsPlaced;
    private Integer doubleKills;
    private Integer dragonKills;
    private Boolean firstBloodAssist;
    private Boolean firstBloodKill;
    private Boolean firstTowerAssist;
    private Boolean firstTowerKill;
    private Integer goldEarned;
    private Integer goldSpent;
    private String individualPosition;
    private Integer inhibitorKills;
    private Integer inhibitorTakedowns;
    private Integer inhibitorLost;
    private Integer item0;
    private Integer item1;
    private Integer item2;
    private Integer item3;
    private Integer item4;
    private Integer item5;
    private Integer item6;
    private Integer itemPurchased;
    private Integer killingSprees;
    private Integer kills;
    private String lane;
    private Integer largestKillingSpree;
    private Integer largestMiltiKill;
    private Integer longestTimeSpentLiving;
    private Integer magicDamageDealt;
    private Integer magidDamageDealtToChampions;
    private Integer magicDamageTaken;
    private Integer neutralMinionsKilled;
    private Integer objectivesStolen;
    private Integer objectivesStolenAssists;
    private Integer participantId;
    private Integer pentakills;
    private Integer physicalDamageDealt;
    private Integer physicalDamageDealtToChampions;
    private Integer physicalDamageTaken;
    private String puuid;
    private Integer quadraKills;
    private String role;
    private Integer sightWardsBoughtInGame;
    private Integer spell1Casts;
    private Integer spell2Casts;
    private Integer spell3Casts;
    private Integer spell4Casts;
    private Integer summoner1Casts;
    private Integer summoner1Id;
    private Integer summoner2Casts;
    private Integer summoner2Id;
    private String summonerId;
    private Integer summonerLevel;
    private String summonerName;
    private Boolean teamEarlySurrendered;
    private Integer teamId;
    private String teamPosition;
    private Integer timeCCingOthers;
    private Integer timePlayed;
    private Integer totalDamageDealt;
    private Integer totalDamageDealtToChampions;
    private Integer totalDamageShieldedOnTeammates;
    private Integer totalDamageTaken;
    private Integer totalHeal;
    private Integer totalHealsOnTeammates;
    private Integer totalMinionsKilled;
    private Integer totalTimeCCDealt;
    private Integer totalTimeSpendDead;
    private Integer totalUnitsHealed;
    private Integer tripleKills;
    private Integer trueDamageDealt;
    private Integer trueDamageDealtToChampions;
    private Integer trueDamageTaken;
    private Integer turretKills;
    private Integer turretTakedowns;
    private Integer turretsLost;
    private Integer unrealKills;
    private Integer visionScore;
    private Integer visionWardsBoughtInGame;
    private Integer wardsKilled;
    private Integer wardsPlaced;
    private Boolean win;
}
