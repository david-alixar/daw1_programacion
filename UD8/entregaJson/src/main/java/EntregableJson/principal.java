package EntregableJson;

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
         .addConverterFactory(GsonConverterFactory.create())
         .build();

      CentralAlumnos service = retrofit.create(CentralAlumnos.class);
      Alumnos alumno = null;
      final Integer AlumnoId = 2;

      System.out.println("Obtenemos el listado completo de alumnos");

      try {
          Response<List<Alumnos>> response = service.listAlumnos().execute();
          if (response.isSuccessful()) {
              List<Alumnos> alumnos = response.body();
              System.out.println(alumnos);
          }else{
              System.out.println("Petición no válida: " + response.message());
          }
      } catch (IOException ex) {
          System.out.println("Error en la petición " + ex.getMessage());
      }
  }
}
