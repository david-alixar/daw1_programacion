package alixar.u4.t1.a5;

public class Text {
    // Atributos
    private int longitud;
    private String cadena;

    // Metodos
    Text(int longitud, String cadena) {
        this.longitud = longitud;
        this.cadena = cadena;
    }
    void mostrar_informacion() {
        int longitud_actual = cadena.length();
        System.out.println("La frase introducida es: " + cadena + " con longitud: " + longitud_actual);
    }
    void anadir_al_final_c(char anadido){
        if (cadena.length() < longitud){
            cadena = cadena + anadido;
        }
        else {
            System.out.println("No se puede añadir nada a la cadena, ya que contiene el máximo de caracteres");
        }
    }

    void anadir_al_inicio_c(char anadido){
        if (cadena.length() < longitud){
            cadena = anadido + cadena;
        }
        else {
            System.out.println("No se puede añadir nada a la cadena, ya que contiene el máximo de caracteres");
        }
    }
    void anadir_al_final_s(String anadido){
        if (cadena.length() + anadido.length() < longitud){
            cadena = cadena + anadido;
        }
        else {
            System.out.println("No se puede añadir nada a la cadena, ya que contiene el máximo de caracteres");
        }
    }

    void anadir_al_inicio_s(String anadido){
        if (cadena.length() + anadido.length() < longitud){
            cadena = anadido + cadena;
        }
        else {
            System.out.println("No se puede añadir nada a la cadena, ya que contiene el máximo de caracteres");
        }
    }



    int contar_vocales() {
        String vocales = "aeiouáéíóúü";;
        int cant_vocales = 0;
        String posible_vocal;
        String vocal;
        for (int i = 0; i < vocales.length(); i++) {
            for (int j = 0; j < cadena.length(); j++) {
               posible_vocal = cadena.substring(j,j+1);
               vocal = vocales.substring(i,i+1);
               if (posible_vocal.equalsIgnoreCase(vocal)){
                   cant_vocales++;
                }
            }
        }
    return cant_vocales;
    }
}
