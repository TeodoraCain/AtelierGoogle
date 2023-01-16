package org.gad.IO;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
public class Athlete implements Serializable {
    private String number;
    private String name;
    private String countryCode;
    private String time;
    private String firstShoot;
    private String secondShoot;
    private String thirdShoot;

    public String getFirstShoot() {
        return firstShoot;
    }

    public String getSecondShoot() {
        return secondShoot;
    }

    public String getThirdShoot() {
        return thirdShoot;
    }

    public Athlete(String number, String name, String countryCode, String time, String firstShoot, String secondShoot, String thirdShoot) {
        this.number = number;
        this.name = name;
        this.countryCode = countryCode;
        this.time = time;
        this.firstShoot = firstShoot;
        this.secondShoot = secondShoot;
        this.thirdShoot = thirdShoot;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("number", number)
                .append("name", name)
                .append("countryCode", countryCode)
                .append("time", time)
                .append("firstShoot", firstShoot)
                .append("secondShoot", secondShoot)
                .append("thirdShoot", thirdShoot)
                .toString();
    }
}
