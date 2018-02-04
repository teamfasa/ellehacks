package databases;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/* DATABASE IS CREATED WHEN THE PROGRAM IS FIRST RUN */
public class Database extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "HDDatabase.db";
    private static final int DATABASE_VERSION = 2;

    public Database(Context context) {
        super(context, DATABASE_NAME, context.getExternalFilesDir(null).getAbsolutePath(), null, DATABASE_VERSION);
    }
}