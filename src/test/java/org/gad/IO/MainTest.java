package org.gad.IO;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.Assert.*;

public class MainTest  {

    @Test
    public void testWriteFile() {
        ArrayList<Athlete> athleteListWrite = new ArrayList<>();
        ArrayList<Athlete> athleteList;

        Athlete athlete1 = new Athlete("11", "Umar Jorgson", "SK", "30:27", "xxxox", "xxxxx", "xxoxo");
        Athlete athlete2 = new Athlete("1", "Jimmy Smiles", "UK", "29:15", "xxoox", "xooxo", "xxxxo");
        Athlete athlete3 = new Athlete("27", "Piotr Smitzer", "CZ", "30:10", "xxxxx", "xxxxx", "xxxxx");

        athleteListWrite.add(athlete1);
        athleteListWrite.add(athlete2);
        athleteListWrite.add(athlete3);

        Main.writeFile(athleteListWrite,"athletes.data");
        athleteList = Main.readFile("athletes.data");

        Comparator<Athlete> comparator = new AthleteComparator();
       for(int i=0;i< athleteListWrite.size();i++){
           assertEquals(0,comparator.compare(athleteListWrite.get(i), athleteList.get(i)));
       }

    }

    @Test
    public void testReadFile() {
        ArrayList<Athlete> athleteListWrite = new ArrayList<>();
        ArrayList<Athlete> athleteList;

        Athlete athlete1 = new Athlete("11", "Umar Jorgson", "SK", "30:27", "xxxox", "xxxxx", "xxoxo");
        Athlete athlete2 = new Athlete("1", "Jimmy Smiles", "UK", "29:15", "xxoox", "xooxo", "xxxxo");
        Athlete athlete3 = new Athlete("27", "Piotr Smitzer", "CZ", "30:10", "xxxxx", "xxxxx", "xxxxx");

        athleteListWrite.add(athlete1);
        athleteListWrite.add(athlete2);
        athleteListWrite.add(athlete3);

        Main.writeFile(athleteListWrite,"athletes.data");
        athleteList = Main.readFile("athletes.data");

        Comparator<Athlete> comparator = new AthleteComparator();
        for(int i=0;i< athleteListWrite.size();i++){
            assertEquals(0,comparator.compare(athleteListWrite.get(i), athleteList.get(i)));
        }
    }
}