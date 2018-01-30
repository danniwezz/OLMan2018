package com.company;


public class Club {

    String name, manager;
    int capital, ranking;

    Club(String name, int capital, String manager){
        this.name = name;
        this.capital = capital;
        this.manager = manager;
        ranking = -1;
    }

    //Geters


    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public int getCapital() {
        return capital;
    }

    public int getRanking() {
        return ranking;
    }

    //seters


    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
