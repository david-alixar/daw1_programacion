package A2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class principal {
    public static void main(String[] args) {

        // Creamos a los jugadores

        Futbolista f1 = new Futbolista(1, "Casillas", Arrays.asList("Portero"),"Real Madrid");
        Futbolista f2 = new Futbolista(15, "Ramos", Arrays.asList("Lateral derecho", "Medio centro"),"Real Madrid");
        Futbolista f3 = new Futbolista(3, "Piqué", Arrays.asList("Central"),"FC Barcelona");
        Futbolista f4 = new Futbolista(5, "Puyol",Arrays.asList("Central"),"FC Barcelona");
        Futbolista f5 = new Futbolista(11, "Capdevila", Arrays.asList("Lateral izquierdo"),"Villarreal");
        Futbolista f6 = new Futbolista(14, "Xabi Alonso",Arrays.asList("Defensa mediocampo", "mediocampo"),"Real Madrid");
        Futbolista f7 = new Futbolista(16, "Busquets", Arrays.asList("Defensa mediocampo"),"FC Barcelona");
        Futbolista f8 = new Futbolista(8, "Xavi Hernández", Arrays.asList("Mediocampo"),"FC Barcelona");
        Futbolista f9 = new Futbolista(18, "Pedrito", Arrays.asList("Extremo izquierdo", "falso extremo"),"FC Barcelona");
        Futbolista f10 = new Futbolista(6, "Iniesta", Arrays.asList("Extremo derecho", "mediocampo"),"FC Barcelona");
        Futbolista f11 = new Futbolista(7, "Villa", Arrays.asList("Delantero centro"),"FC Barcelona");

        // Creamos el ArrayList con los jugadores e introducimos los jugadores creados en el mismo

        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(f1);
        futbolistas.add(f2);
        futbolistas.add(f3);
        futbolistas.add(f4);
        futbolistas.add(f5);
        futbolistas.add(f6);
        futbolistas.add(f7);
        futbolistas.add(f8);
        futbolistas.add(f9);
        futbolistas.add(f10);
        futbolistas.add(f11);

        // Creamos el objeto Gson para la conversión

        Gson gson = new Gson();

        // Convertimos a Json

        String json_array = gson.toJson(futbolistas);

        // Hacemos el paso inverso desde Json

        Type listType = new TypeToken<ArrayList<Futbolista>>() {}.getType();
        ArrayList<Futbolista> array_de_json = gson.fromJson(json_array, listType);
        System.out.println(array_de_json);

        // Recorro el ArrayList de futbolistas y busco a Ramos para sacar sus demarcaciones

        String jugador = "Ramos";
        ArrayList<String> demarcaciones_de_Ramos = new ArrayList<>();;
        Iterator it = array_de_json.iterator();
        boolean esta = false;

        while(it.hasNext()){
            Futbolista fut = (Futbolista) it.next();
            if (fut.getNombre().equalsIgnoreCase(jugador)){
                demarcaciones_de_Ramos.addAll(fut.getDemarcaciones());
                esta = true;
            break;
            }
        }

        if (!esta) {
            System.out.println("No he encontrado a " + jugador);
        }
        else {
        System.out.println("Demarcaciones de " + jugador + ": " + demarcaciones_de_Ramos);
        }
    }
}
