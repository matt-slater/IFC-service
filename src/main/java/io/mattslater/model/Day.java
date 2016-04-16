package io.mattslater.model;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by synapserelapse on 4/15/16.
 */
public enum Day {

    SUNDAY(0),
    MONDAY (1),
    TUESDAY (2),
    WEDNESDAY (3),
    THURSDAY (4),
    FRIDAY (5),
    SATURDAY (6);

    private static final Map<Integer, Day> map = new HashMap<Integer, Day>();

    static {
        for (Day dayEnum : EnumSet.allOf(Day.class)) {
            map.put(dayEnum. code, dayEnum);
        }
    }

    private int code;

    Day(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Day get(int code) {
        return map.get(code);
    }

    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
