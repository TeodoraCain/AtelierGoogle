package org.gad.IO;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Athlete> athleteListWrite = new ArrayList<>();
        ArrayList<Athlete> athleteList;

        Athlete athlete1 = new Athlete("11", "Umar Jorgson", "SK", "30:27", "xxxox", "xxxxx", "xxoxo");
        Athlete athlete2 = new Athlete("1", "Jimmy Smiles", "UK", "29:15", "xxoox", "xooxo", "xxxxo");
        Athlete athlete3 = new Athlete("27", "Piotr Smitzer", "CZ", "30:10", "xxxxx", "xxxxx", "xxxxx");

        athleteListWrite.add(athlete1);
        athleteListWrite.add(athlete2);
        athleteListWrite.add(athlete3);

        writeFile(athleteListWrite, "athletes.data" );
        athleteList = readFile("athletes.data");

        Comparator comparator = new AthleteComparator();
        Collections.sort(athleteList, comparator);

        for (Athlete athlete : athleteList) {
            System.out.println(athlete);
        }
    }

    public static void writeFile(ArrayList<Athlete> athletes, String fileName) {
        try (ObjectOutputStream storage = new ObjectOutputStream(new FileOutputStream(fileName))) {
            storage.writeObject(athletes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Athlete> readFile(String fileName){
        ArrayList<Athlete> athletes = new ArrayList<>();
        try {
            ObjectInputStream storageReader = new ObjectInputStream(new FileInputStream(fileName));

            athletes = (ArrayList<Athlete>) storageReader.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return athletes;
    }

}
