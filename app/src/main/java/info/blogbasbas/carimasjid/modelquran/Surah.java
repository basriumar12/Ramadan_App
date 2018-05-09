package info.blogbasbas.carimasjid.modelquran;



public class Surah extends ModelSurah {
    public Surah(String surah, String ayat, String terjemahan, String jumlahAyat) {
        super(surah, ayat, terjemahan, jumlahAyat);
    }

    @Override
    public String getSurah() {
        return super.getSurah();
    }

    @Override
    public String getAyat() {
        return super.getAyat();
    }

    @Override
    public String getTerjemahan() {
        return super.getTerjemahan();
    }

    @Override
    public String getJumlahAyat() {
        return super.getJumlahAyat();
    }
}
