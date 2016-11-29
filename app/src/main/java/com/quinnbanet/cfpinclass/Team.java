package com.quinnbanet.cfpinclass;

/**
 * Created by quinnbanet on 11/28/16.
 */

public class Team {
    private long id;
    private long loses;
    private String mascot;
    private String name;
    private String picture;
    private long wins;

    public Team(){}


    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", loses=" + loses +
                ", mascot='" + mascot + '\'' +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", wins=" + wins +
                '}';
    }


    public Team(long id, long loses, String mascot, String name, String picture, long wins) {
        this.id = id;
        this.loses = loses;
        this.mascot = mascot;
        this.name = name;
        this.picture = picture;
        this.wins = wins;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
