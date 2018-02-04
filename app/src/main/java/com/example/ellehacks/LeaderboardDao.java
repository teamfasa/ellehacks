package com.example.ellehacks;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/* OBJECT/INTERFACE USED TO ACCESS DATA FROM DATABASE OF DATA STORAGE */
@Dao
public interface LeaderboardDao {
    @Query("SELECT * from leaderboard ORDER BY points desc")
    List<Leaderboard> getAll();

    @Insert
    void insertAll(Leaderboard leaderboard);

    @Update
    void updateUsers(Leaderboard leaderboard);

    @Delete
    void delete(Leaderboard leaderboard);
}