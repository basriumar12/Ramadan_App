package info.blogbasbas.carimasjid.database;

import android.provider.BaseColumns;



public class DatabaseContract {

    static final String DATABASE_NAME = "ramadhan.db";
    static final int DATABASE_VERSION = 2;

    public static final String LOAD_TERJEMEMAHAN_INDONESIA = "TerjemahanIndonesia";
    public static final String LOAD_TERJEMEMAHAN_ENGLISH = "TerjemahanEnglish";

    public static class TableSurah implements BaseColumns {
        public static final String TABLE_SURAH = "table_surah";

        public static final String SURAH = "Surah";
        public static final String AYAT = "Ayat";
        public static String NOTE = "note";

        public static final String TERJEMAHAN_INDONESIA = LOAD_TERJEMEMAHAN_INDONESIA;
        public static final String TERJEMAHAN_ENGLISH = LOAD_TERJEMEMAHAN_ENGLISH;
        public static final String JUMLAH_AYAT = "Jumlah_Ayat";

        static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_SURAH + "("
                + SURAH + " TEXT,"
                + AYAT + " TEXT,"
                + TERJEMAHAN_INDONESIA + " TEXT,"
                + TERJEMAHAN_ENGLISH + " TEXT,"
                + JUMLAH_AYAT + " TEXT)";
        public static final String QUERY_STATEMENT = "INSERT INTO " + TABLE_SURAH + "(" + SURAH + "," + AYAT + "," + TERJEMAHAN_INDONESIA + "," + TERJEMAHAN_ENGLISH + "," + JUMLAH_AYAT + ") VALUES (?,?,?,?,?)";
    }

    public static class TableAyat implements BaseColumns {
        public static final String TABLE_AYAT = "table_ayat";

        public static final String SURAH = "Surah";
        public static final String AYAT = "Ayat";
        public static final String ARAB = "Arab";
        public static final String TERJEMAHAN_INDONESIA = LOAD_TERJEMEMAHAN_INDONESIA;
        public static final String TERJEMAHAN_ENGLISH = LOAD_TERJEMEMAHAN_ENGLISH;

        static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_AYAT + "("
                + SURAH + " TEXT,"
                + AYAT + " TEXT,"
                + ARAB + " TEXT,"
                + TERJEMAHAN_INDONESIA + " TEXT,"
                + TERJEMAHAN_ENGLISH + " TEXT)";

        public static final String QUERY_STATEMENT = "INSERT INTO " + TABLE_AYAT + "(" + SURAH + "," + AYAT + "," + ARAB + "," + TERJEMAHAN_INDONESIA + "," + TERJEMAHAN_ENGLISH + ") VALUES (?,?,?,?,?)";
    }



    public static final class TableNote implements BaseColumns {
        public static final String TABLE_NOTE= "table_note";
        //Note title
        public static String TITLE = "title";
        //Note description
        public static String DESCRIPTION = "description";
        //Note date
        public static String DATE = "date";
        public static String SHOLATISYA = "isya";
        public static String SHOLATSUBUH = "subuh";
        public static String SHOLATZUHUR = "zuhur";
        public static String SHOLATASHAR = "ashar";
        public static String SHOLATMAGRIB = "magrib";
        public static String QURAN = "quran";
        public static String QULTUM = "qultum";

        static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NOTE + "("
                + TITLE + "TEXT,"
                + DESCRIPTION + "TEXT,"
                + DATE + "TEXT,"
                + SHOLATISYA + "TEXT,"
                + SHOLATSUBUH + "TEXT,"
                + SHOLATZUHUR + "TEXT,"
                + SHOLATASHAR + "TEXT,"
                + SHOLATMAGRIB + "TEXT,"
                + QURAN + "TEXT,"
                + QULTUM + "TEXT)";
        public static final String QUERY_STATEMENT = "INSERT INTO " +TABLE_NOTE + "(" + TITLE +"," +DESCRIPTION  +
                "," + DATE+ "," + SHOLATSUBUH+","+ SHOLATZUHUR +"," +SHOLATASHAR+","
                + SHOLATMAGRIB+"," +SHOLATISYA+","+QURAN+","+QULTUM+ ") VALUES (?,?,?,?,?,?,?,?,?,?)";



    }
}
