package com.riot.db.entity;


import com.entity.match.Participant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="participant")
@Getter @Setter
@NoArgsConstructor
public class ParticipantEntity {

    public ParticipantEntity(Participant participant) {
        this.assists = participant.getAssists();
        this.baronKills = participant.getBaronKills();
        this.bountyLevel = participant.getBountyLevel();
        this.champExperience = participant.getChampExperience();
        this.champLevel = participant.getChampLevel();
        this.championId = participant.getChampionId();
        this.championName = participant.getChampionName();
        this.damageDealtToBuildings = participant.getDamageDealtToBuildings();
        this.damageDealtToObjectives = participant.getDamageDealtToObjectives();
        this.damageDealtToTurrets = participant.getDamageDealtToTurrets();
        this.damageSelfMitigated = participant.getDamageSelfMitigated();
        this.deaths = participant.getDeaths();
        this.detectorWardsPlaced = participant.getDetectorWardsPlaced();
        this.doubleKills = participant.getDoubleKills();
        this.dragonKills = participant.getDragonKills();
        this.firstBloodAssist = participant.getFirstBloodAssist();
        this.firstBloodKill = participant.getFirstBloodKill();
        this.firstTowerAssist = participant.getFirstTowerAssist();
        this.firstTowerKill = participant.getFirstTowerKill();
        this.goldEarned = participant.getGoldEarned();
        this.goldSpent = participant.getGoldSpent();
        this.individualPosition = participant.getIndividualPosition();
        this.inhibitorKills = participant.getInhibitorKills();
        this.inhibitorTakedowns = participant.getInhibitorTakedowns();
        this.inhibitorLost = participant.getInhibitorLost();
        this.item0 = participant.getItem0();
        this.item1 = participant.getItem1();
        this.item2 = participant.getItem2();
        this.item3 = participant.getItem3();
        this.item4 = participant.getItem4();
        this.item5 = participant.getItem5();
        this.item6 = participant.getItem6();
        this.itemPurchased = participant.getItemPurchased();
        this.killingSprees = participant.getKillingSprees();
        this.kills = participant.getKills();
        this.lane = participant.getLane();
        this.largestKillingSpree = participant.getLargestKillingSpree();
        this.largestMiltiKill = participant.getLargestMiltiKill();
        this.longestTimeSpentLiving = participant.getLongestTimeSpentLiving();
        this.magicDamageDealt = participant.getMagicDamageDealt();
        this.magidDamageDealtToChampions = participant.getMagidDamageDealtToChampions();
        this.magicDamageTaken = participant.getMagicDamageTaken();
        this.neutralMinionsKilled = participant.getNeutralMinionsKilled();
        this.objectivesStolen = participant.getObjectivesStolen();
        this.objectivesStolenAssists = participant.getObjectivesStolenAssists();
        this.participantId = participant.getParticipantId();
        this.pentakills = participant.getPentakills();
        this.physicalDamageDealt = participant.getPhysicalDamageDealt();
        this.physicalDamageDealtToChampions = participant.getPhysicalDamageDealtToChampions();
        this.physicalDamageTaken = participant.getPhysicalDamageTaken();
        this.puuid = participant.getPuuid();
        this.quadraKills = participant.getQuadraKills();
        this.role = participant.getRole();
        this.sightWardsBoughtInGame = participant.getSightWardsBoughtInGame();
        this.spell1Casts = participant.getSpell1Casts();
        this.spell2Casts = participant.getSpell2Casts();
        this.spell3Casts = participant.getSpell3Casts();
        this.spell4Casts = participant.getSpell4Casts();
        this.summoner1Casts = participant.getSummoner1Casts();
        this.summoner1Id = participant.getSummoner1Id();
        this.summoner2Casts = participant.getSummoner2Casts();
        this.summoner2Id = participant.getSummoner2Id();
        this.summonerId = participant.getSummonerId();
        this.summonerLevel = participant.getSummonerLevel();
        this.summonerName = participant.getSummonerName();
        this.teamEarlySurrendered = participant.getTeamEarlySurrendered();
        this.teamId = participant.getTeamId();
        this.teamPosition = participant.getTeamPosition();
        this.timeCCingOthers = participant.getTimeCCingOthers();
        this.timePlayed = participant.getTimePlayed();
        this.totalDamageDealt = participant.getTotalDamageDealt();
        this.totalDamageDealtToChampions = participant.getTotalDamageDealtToChampions();
        this.totalDamageShieldedOnTeammates = participant.getTotalDamageShieldedOnTeammates();
        this.totalDamageTaken = participant.getTotalDamageTaken();
        this.totalHeal = participant.getTotalHeal();
        this.totalHealsOnTeammates = participant.getTotalHealsOnTeammates();
        this.totalMinionsKilled = participant.getTotalMinionsKilled();
        this.totalTimeCCDealt = participant.getTotalTimeCCDealt();
        this.totalTimeSpendDead = participant.getTotalTimeSpendDead();
        this.totalUnitsHealed = participant.getTotalUnitsHealed();
        this.tripleKills = participant.getTripleKills();
        this.trueDamageDealt = participant.getTrueDamageDealt();
        this.trueDamageDealtToChampions = participant.getTrueDamageDealtToChampions();
        this.trueDamageTaken = participant.getTrueDamageTaken();
        this.turretKills = participant.getTurretKills();
        this.turretTakedowns = participant.getTurretTakedowns();
        this.turretsLost = participant.getTurretsLost();
        this.unrealKills = participant.getUnrealKills();
        this.visionScore = participant.getVisionScore();
        this.visionWardsBoughtInGame = participant.getVisionWardsBoughtInGame();
        this.wardsKilled = participant.getWardsKilled();
        this.wardsPlaced = participant.getWardsPlaced();
        this.win = participant.getWin();

    }

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

    public MatchEntity getMatch(){
        return this.team.getMatch();
    }

}
