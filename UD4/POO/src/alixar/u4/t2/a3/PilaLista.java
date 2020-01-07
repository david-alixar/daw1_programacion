package alixar.u4.t2.a3;

import alixar.u4.t2.a1.Lista;

public class PilaLista {
        // Atributos
        private Lista pila;

        // Metodos
        public PilaLista() {
            pila = new Lista();
        }
    public void apilar (int cant) {
            for (int i = 0; i < cant; i++) {
                pila.anadir_posicion(i, i+1);
            }
            System.out.println((pila.devolver_lista()));
    }
    public void desapilar () {
            System.out.println(pila.desapilar_lista());
    }
    }
