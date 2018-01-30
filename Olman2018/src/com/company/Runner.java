package com.company;


import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Runner {
    private String name, club, nationality, gender;
    private int skill, potential, age, rating;

    private TreeMap<String, Integer> dayOL = new TreeMap<String, Integer>();
    private TreeMap<String, Integer> nightOL = new TreeMap<String, Integer>();
    private TreeMap<String, Integer> physical = new TreeMap<String, Integer>();
    private TreeMap<String, Integer> relay = new TreeMap<String, Integer>();

        //dayOL: object, compass, height
        //nightOL:Object, compass
        //Physical: Pace, Stamina, injuryRes



    Runner(String name, String club, String nationality,int skill, int potential, int age, String gender){
        this.name = name;
        this.club = club;
        this nationality = nationality;
        this.skill = skill;
        this.potential = potential;
        this.age = age;
        if(potential > 9 ){

            ArrayList<Integer> stats = new ArrayList<Integer>();
            for(int i = 0; i<10;i++){
                Random rand = new Random();
                int r = rand.nextInt(20 - 1) +10;
                int stat = r%20;
                stats.add(i,stat);
            }

            dayOL.put("object", stats.get(0));
            dayOL.put("compass", stats.get(1));
            dayOL.put("height", stats.get(2));

            nightOL.put("object", stats.get(3));
            nightOL.put("compass", stats.get(4));

            physical.put("pace", stats.get(5));
            physical.put("stamina", stats.get(6));
            physical.put("injury res.", stats.get(7));

            relay.put("start", stats.get(8));
            relay.put("start", stats.get(9));


        }
        this.rating = 0;
        this.gender = gender;

    }


    //Geters
    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public String getNationality() {
        return nationality;
    }

    public int getSkill() {
        return skill;
    }

    public int getPotential() {
        return potential;
    }

    public int getAge() {
        return age;
    }

    public int getRating() {
        return rating;
    }

    public String getGender() {
        return gender;
    }

    //Seters


    public void setAge(int age) {
        this.age = age;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
