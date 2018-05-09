package info.blogbasbas.carimasjid.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Items {
    @SerializedName("items")
    public List<Jadwal> items;
    String status_valid;

    public String getStatus_valid() {
        return status_valid;
    }

    public void setStatus_valid(String status_valid) {
        this.status_valid = status_valid;
    }

    public Items(List<Jadwal> items) {
        this.items = items;
    }

    public List<Jadwal> getItems() {
        return items;
    }

    public void setItems(List<Jadwal> items) {
        this.items = items;
    }
}
