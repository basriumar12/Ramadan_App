package info.blogbasbas.carimasjid.network;

import info.blogbasbas.carimasjid.model.Items;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface ApiInterface {

    @GET("{periode}/daily.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);
}
