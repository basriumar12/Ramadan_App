package info.blogbasbas.carimasjid.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 05/05/2018.
 */

public class NoteHelper {
    private static String DATABASE_TABLE = DatabaseContract.TableNote.TABLE_NOTE;
    private Context context;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;

    public NoteHelper(Context context) {
        this.context = context;
    }
    public NoteHelper open() throws SQLException{
        databaseHelper = new DatabaseHelper(context);
        database = databaseHelper.getWritableDatabase();
        return this;
    }

    public void close (){
        databaseHelper.close();
    }

}
