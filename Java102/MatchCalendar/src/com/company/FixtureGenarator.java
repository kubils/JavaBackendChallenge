package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FixtureGenarator {

    public void generate() {
        HashSet<String> teams = new HashSet<>();

        teams.add("Fenerbahçe");
        teams.add("Galatasaray");
        teams.add("Trabzonspor");
        teams.add("Bursaspor");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");

        int numberOfTeams = teams.size();
        boolean bay = false;

        if (teams.size() % 2 != 0) {
            numberOfTeams++;
            teams.add("Bay");
            bay = true;
        }

        int matchNumber = teams.size() / 2;
        Map<String,String> matches = new HashMap<>();

        for (int i = 0; i < matchNumber; i++) {
            for(String s : teams) {
            }
            matches.put(s,)
        }
    }
}
