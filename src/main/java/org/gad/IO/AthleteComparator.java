package org.gad.IO;

import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class AthleteComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete athlete1, Athlete athlete2) {
        DateFormat formatter = new SimpleDateFormat("mm:ss");
        Date time1, time2;
        try {
            time1 = formatter.parse(athlete1.getTime());
            time2 = formatter.parse(athlete2.getTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        int penaltyAthlete1 = (athlete1.getFirstShoot().length() - athlete1.getFirstShoot().replace("o", "").length());
        int penaltyAthlete2 = (athlete2.getFirstShoot().length() - athlete2.getFirstShoot().replace("o", "").length());

        penaltyAthlete1 += (athlete1.getSecondShoot().length() - athlete1.getSecondShoot().replace("o", "").length());
        penaltyAthlete2 += (athlete2.getSecondShoot().length() - athlete2.getSecondShoot().replace("o", "").length());

        penaltyAthlete1 += (athlete1.getThirdShoot().length() - athlete1.getThirdShoot().replace("o", "").length());
        penaltyAthlete2 += (athlete2.getThirdShoot().length() - athlete2.getThirdShoot().replace("o", "").length());

        Date finalTime1 = DateUtils.addSeconds(time1, penaltyAthlete1 * 10);
        Date finalTime2 = DateUtils.addSeconds(time2, penaltyAthlete2 * 10);
        System.out.println("penalty1 = " + penaltyAthlete1 + "\npenalty2 = " + penaltyAthlete2);
        System.out.println("\nfinaltime1 =" + finalTime1 + "\nfinaltime2 =" + finalTime2);
        return finalTime1.compareTo(finalTime2);
    }
}
