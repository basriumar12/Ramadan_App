package info.blogbasbas.carimasjid.model;

import com.google.gson.annotations.SerializedName;




public class Jadwal {
    @SerializedName("date_for")
    public String tanggal;
    @SerializedName("fajr")
    public String fajar;
    @SerializedName("shurooq")
    public String subuh;
    @SerializedName("dhuhr")
    public String zuhur;
    @SerializedName("asr")
    public String ashar;
    @SerializedName("maghrib")
    public String maghrib;
    @SerializedName("isha")
    public String isya;

    public String getTanggal() {
        return tanggal;
    }

    public String getFajar() {
        return fajar;
    }

    public String getSubuh() {
        return subuh;
    }

    public String getZuhur() {
        return zuhur;
    }

    public String getAshar() {
        return ashar;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public String getIsya() {
        return isya;
    }
}
