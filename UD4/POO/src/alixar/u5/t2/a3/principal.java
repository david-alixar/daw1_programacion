package alixar.u5.t2.a3;

import java.util.Arrays;
import java.util.Comparator;

public class principal{
    public static void main(String[] args) {
        Figura f1 = new Cuadrado();
        Figura f2 = new Triangulo();
        Figura f3 = new Circulo(25);
        Figura f4 = new Triangulo(16,colores.amarillo,4);
        Figura f5 = new Triangulo(11,colores.verde,3);
        Figura figuras [] = new Figura [5];
        figuras [0] = f1;
        figuras [1] = f2;
        figuras [2] = f3;
        figuras [3] = f4;
        figuras [4] = f5;
        for (int i = 0; i<=4; i++){
            System.out.println(figuras[i]);
        }
        System.out.println("Polígonos regulares construidos: " + PoligonoRegular.contadorPoligonos);

        Triangulo triangulos [] = new Triangulo [5];
        triangulos [0] = new Triangulo();
        triangulos [1] = new Triangulo(16,colores.amarillo,4);
        triangulos [2] = new Triangulo(21,colores.verde,2);
        triangulos [3] = new Triangulo(11,colores.rojo,14);
        triangulos [4] = new Triangulo(26,colores.azul,9);

        Arrays.sort(triangulos);

        System.out.println("Array triángulos ordenado por el tamaño de su lado:");
        for (int i = 0; i<=4; i++){
            System.out.println(triangulos[i]);
        }

        System.out.println("Array triángulos ordenado por el tamaño de su color:");

        Arrays.sort(
                triangulos,
                new Comparator(){
                    public int compare(Object obj1, Object obj2) {
                        int resultado = 0;
                        Triangulo t1 =  (Triangulo) obj1;
                        Triangulo t2 = (Triangulo) obj2;
                        return t1.get_color().name().compareTo(t2.get_color().name());
                    }
                });
        for (int i = 0; i<=4; i++){
            System.out.println(triangulos[i]);
        }
    }

}
