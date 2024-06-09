package com.jonsuttoncodes.baseball.war.calculator;

import com.jonsuttoncodes.baseball.model.Position;

import java.util.Map;

public class PositionalAdjustment {

    /**
     * Calculates the positional adjustment.
     *
     * @param position Position played.
     * @param innings Innings spent at the position.
     * @return Total positional adjustment.
     */
    public double calculatePositionalAdjustmentRuns(Position position, Double innings) {
        return getPositionalAdjustment(position) * innings / 1350.0;
    }

    /**
     * Calculates the positional adjustment for multiple positions.
     *
     * @param inningsByPosition Innings for each position.
     * @return Total sum of positional adjustments.
     */
    public double calculatePositionalAdjustmentRuns(Map<Position, Double> inningsByPosition) {
        return inningsByPosition.entrySet().stream()
                .mapToDouble(es -> calculatePositionalAdjustmentRuns(es.getKey(), es.getValue()))
                .sum();
    }

    /**
     * Returns the positional adjustment for a position.
     *
     * @param position Position
     * @return Positional Adjustment value
     */
    private double getPositionalAdjustment(Position position) {
        return switch(position) {
            case CATCHER -> 9.0;
            case SHORTSTOP -> 7.0;
            case SECOND_BASE -> 3.0;
            case CENTER_FIELD -> 2.5;
            case THIRD_BASE -> 2.0;
            case LEFT_FIELD, RIGHT_FIELD -> -7.0;
            case FIRST_BASE -> -9.5;
            case DESIGNATED_HITTER -> -15;
            default -> 0;
        };
    }
}
