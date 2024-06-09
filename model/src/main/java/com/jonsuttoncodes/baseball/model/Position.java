package com.jonsuttoncodes.baseball.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Position {

    PITCHER(1),
    CATCHER(2),
    FIRST_BASE(3),
    SECOND_BASE(4),
    THIRD_BASE(5),
    SHORTSTOP(6),
    LEFT_FIELD(7),
    CENTER_FIELD(8),
    RIGHT_FIELD(9),
    DESIGNATED_HITTER(10),
    PINCH_HITTER(null),
    PINCH_RUNNER(null);

    Integer scoringNum;
}
