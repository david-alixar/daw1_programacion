package EntregableJson;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CentralAlumnos {

    @GET("/alumnos?_embed=asignaturas");
    Call<List<Alumnos>> listAlumnos();
}
