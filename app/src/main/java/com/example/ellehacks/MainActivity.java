package com.example.ellehacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.util.Log;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Start";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

         //Logger.getLogger("").log("--------------------***************--------------");
        Log.v(TAG, "in onCreate method ");
        System.out.print("in onCreate method");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Database db = Database.databaseBuilder(getApplicationContext(), Database.class, "HDDatabase").build();
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "HDDatabase").build();
        List<Leaderboard> leaderBoard = db.leaderboardDao().getAll();

        Log.v(TAG, "123 Leader board results: ");
        Log.v(TAG, "Leader board results: " + leaderBoard.size());

        //System.out.print("123 Leader board results: ");
        //System.out.print("Leader board results: " + leaderBoard.size());
        //new LongOperation().execute();
    }

    /*
    private class LongOperation extends AsyncTask <AppDatabase... db> {
        @Override
        protected String doInBackground(AppDatabase... db) {
            List<Leaderboard> leaderBoard = db.leaderboardDao().getAll();
        }

        @Override
        protected void onPostExecute(List<Leaderboard>... leaderBoard) {
            System.out.print("123 Leader board results: ");
            System.out.print("Leader board results: " + leaderBoard.size());
        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(Void... values) {}
    }
    */
}
