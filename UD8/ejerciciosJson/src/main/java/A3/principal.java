package A3;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class principal {
  public static void main(String[] args) {
    //
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
            //.baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    CentralFutbolistas service = retrofit.create(CentralFutbolistas.class);
    Futbolista futbolista = null;
    final Integer FutbolistaId = 2;

    System.out.println("Obtenemos el listado completo de futbolistas");

    try {
    Response<List<Futbolista>> response = service.listFutbolistas().execute();
    if (response.isSuccessful()) {
        List<Futbolista> futbolistas = response.body();
        System.out.println(futbolistas);
    }else{
        System.out.println("Petición no válida: " + response.message());
    }
    } catch (IOException ex) {
      System.out.println("Error en la petición " + ex.getMessage());
    }
  }
}
