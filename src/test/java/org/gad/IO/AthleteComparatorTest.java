package org.gad.IO;

import org.junit.Test;
import java.util.Comparator;
import static org.junit.Assert.*;


public class AthleteComparatorTest {

    @Test
    public void athletesWithSameTimeShouldBeEqual() {
        Athlete athlete1 = new Athlete("1", "Test Athlete1", "CODE", "30:30", "xxxxx", "xxxxx", "xxxxx");
        Athlete athlete2 = new Athlete("2", "Test Athlete2", "CODE", "29:20", "xxooox", "ooxxx", "xxoox");
        Comparator comparator = new AthleteComparator();
        assertEquals(0, comparator.compare(athlete1, athlete2));

        Athlete athlete3 = new Athlete("1", "Test Athlete1", "CODE", "00:30", "xxxxo", "xxoxx", "xxxxo");
        Athlete athlete4 = new Athlete("2", "Test Athlete2", "CODE", "00:20", "xxxxx", "ooxxx", "xxoox");
        assertEquals(0, comparator.compare(athlete3, athlete4));

    }

    @Test
    public void athletesWithLessTimeShouldBeLower() {
        Athlete athlete5 = new Athlete("1", "Test Athlete1", "CODE", "00:30", "xxxxo", "xxoxx", "xxxxx");
        Athlete athlete6 = new Athlete("2", "Test Athlete2", "CODE", "00:20", "xxxxx", "ooxxx", "xooox");
        Comparator comparator = new AthleteComparator();
        assertTrue("true", comparator.compare(athlete5, athlete6) < 0);

        Athlete athlete7 = new Athlete("1", "Test Athlete1", "CODE", "00:30", "xxxxo", "xxoxx", "xxxxo");
        Athlete athlete8 = new Athlete("2", "Test Athlete2", "CODE", "10:20", "xxxxx", "xxxxx", "xxxxx");
        assertTrue("true", comparator.compare(athlete7, athlete8) < 0);
    }

    @Test
    public void athletesWithMoreTimeShouldBeHigher() {
        Athlete athlete5 = new Athlete("1", "Test Athlete1", "CODE", "00:30", "xoooo", "xxooo", "xxxxx");
        Athlete athlete6 = new Athlete("2", "Test Athlete2", "CODE", "00:20", "xxxxx", "oxxxx", "xooox");
        Comparator comparator = new AthleteComparator();
        assertTrue("true", comparator.compare(athlete5, athlete6) > 0);

        Athlete athlete7 = new Athlete("1", "Test Athlete1", "CODE", "00:30", "xooox", "xxoxx", "xxxxo");
        Athlete athlete8 = new Athlete("2", "Test Athlete2", "CODE", "00:20", "xooox", "xxoxx", "xxxxo");
        assertTrue("true", comparator.compare(athlete7, athlete8) > 0);
    }


}