package info.blogbasbas.carimasjid.modelnote;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by User on 05/05/2018.
 */

public class Note implements Parcelable {
    private int id;
    private String title;
    private String description;
    private String date;
    private String SholatSubuh;
    private String SholatZuhur;
    private String SholatAshar;
    private String SholatMagrib;
    private String SholatIsya;
    private String Quran;
    private String Qultum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSholatSubuh() {
        return SholatSubuh;
    }

    public void setSholatSubuh(String sholatSubuh) {
        SholatSubuh = sholatSubuh;
    }

    public String getSholatZuhur() {
        return SholatZuhur;
    }

    public void setSholatZuhur(String sholatZuhur) {
        SholatZuhur = sholatZuhur;
    }

    public String getSholatAshar() {
        return SholatAshar;
    }

    public void setSholatAshar(String sholatAshar) {
        SholatAshar = sholatAshar;
    }

    public String getSholatMagrib() {
        return SholatMagrib;
    }

    public void setSholatMagrib(String sholatMagrib) {
        SholatMagrib = sholatMagrib;
    }

    public String getSholatIsya() {
        return SholatIsya;
    }

    public void setSholatIsya(String sholatIsya) {
        SholatIsya = sholatIsya;
    }

    public String getQuran() {
        return Quran;
    }

    public void setQuran(String quran) {
        Quran = quran;
    }

    public String getQultum() {
        return Qultum;
    }

    public void setQultum(String qultum) {
        Qultum = qultum;
    }

    public static Creator<Note> getCREATOR() {
        return CREATOR;
    }

    protected Note(Parcel in) {
        id = in.readInt();
        title = in.readString();
        description = in.readString();
        date = in.readString();
        SholatSubuh = in.readString();
        SholatZuhur = in.readString();
        SholatAshar = in.readString();
        SholatMagrib = in.readString();
        SholatIsya = in.readString();
        Quran = in.readString();
        Qultum = in.readString();
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(title);
        parcel.writeString(description);
        parcel.writeString(date);
        parcel.writeString(SholatSubuh);
        parcel.writeString(SholatZuhur);
        parcel.writeString(SholatAshar);
        parcel.writeString(SholatMagrib);
        parcel.writeString(SholatIsya);
        parcel.writeString(Quran);
        parcel.writeString(Qultum);
    }
}
