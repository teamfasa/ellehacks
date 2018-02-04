package com.example.ellehacks;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity (tableName = "leaderboard")
public class Leaderboard {

    @PrimaryKey
    private int rowid;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "points")
    private int points;

    public int getRowid() {
        return rowid;
    }

    public String getEmail() {
        return email;
    }

    public int getPoints() {
        return points;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}