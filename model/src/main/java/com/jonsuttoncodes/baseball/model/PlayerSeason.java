package com.jonsuttoncodes.baseball.model;

import java.util.Map;

/**
 * Context for a player associated with a current season.
 */
public class PlayerSeason {

    Season season;
    Map<Team, PlayerTeamSeason> playerTeamSeasons;
}
