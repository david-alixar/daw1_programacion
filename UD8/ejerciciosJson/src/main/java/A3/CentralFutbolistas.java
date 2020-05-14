package A3;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CentralFutbolistas {

    // https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/json_api_dem/futbolistas
    @GET("jugadores")
    Call<List<Futbolista>> listFutbolistas();
}
