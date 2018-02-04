/**
 * Created by ANUPYA on 2018-02-03.
 */

package com.example.ellehacks;

import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Database;

@Database(entities = {Leaderboard.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LeaderboardDao leaderboardDao();
}