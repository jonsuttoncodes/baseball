package com.jonsuttoncodes.baseball.war.calculator;

public class ReplacementLevel {

    private static final int REPLACEMENT_WINS = 1000;
    private static final double POSITIONAL_SPLIT = 59.0;
    private static final double PITCHER_SPLIT = 41.0;

    public double calculatePositionPlayerReplacementRuns(Integer plateAppearances) {
        return REPLACEMENT_WINS * (MLB GAMES / 2430) * (RUNS PER WIN / LEAGUE PAs) * plateAppearances;
    }

}
