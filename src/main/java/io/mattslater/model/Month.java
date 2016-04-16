package io.mattslater.model;

import java.util.EnumSet;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by synapserelapse on 4/15/16.
 */
public enum Month {
    JANUARY (0),
    FEBRUARY (1),
    MARCH (2),
    APRIL (3),
    MAY (4),
    JUNE (5),
    SOL (6),
    JULY (7),
    AUGUST (8),
    SEPTEMBER (9),
    OCTOBER (10),
    NOVEMBER (11),
    DECEMBER (12);

    private static final Map<Integer, Month> lookup = new HashMap<Integer, Month>();

    static {
        for (Month w : EnumSet.allOf(Month.class))
            lookup.put(w.getCode(), w);
    }

    private int code;

    Month(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Month get(int code) {
        return lookup.get(code);
    }

    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }

}
