package alixar.u7.t5.a1;

import java.io.*;
import java.util.*;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase_menu = "MENÚ\n" +
                "1) Introducir datos de aspirantes\n" +
                "2) Calificar prueba\n" +
                "3) Aprobados\n" +
                "4) Salir";
        System.out.println(frase_menu);
        int menu = teclado.nextInt();
        teclado.nextLine();
        while (menu != 4) {
            switch (menu) {
                case 1:
                    IntroducirAspirantes ia = new IntroducirAspirantes();
                    System.out.println("Introduzca en este orden: nombre, DNI y teléfono del aspirante.");
                    String nombre = teclado.nextLine();
                    String dni = teclado.nextLine();
                    String telefono = teclado.nextLine();
                    Map<Integer, Aspirante> aspirantes = new LinkedHashMap<>();
                    List<Integer> ids = new ArrayList<>();
                    while (!nombre.equals("0")) {
                        ia.InsertaAspirante(nombre, dni, telefono, aspirantes, ids);
                        System.out.println("Introduzca en este orden: nombre, DNI y teléfono. 0 para salir");
                        nombre = teclado.nextLine();
                        if (nombre.equals("0")) {
                            break;
                        }
                        dni = teclado.nextLine();
                        telefono = teclado.nextLine();
                    }
                    guardarFircheros(aspirantes, ids);
                    System.out.println(frase_menu);
                    menu = teclado.nextInt();
                    teclado.nextLine();
                    break;
                case 2:
                    List<Integer> ids2 = new ArrayList<>();
                    ids2 = cargaIds(ids2);
                    Map<Integer, List> mapaCalificaciones = new LinkedHashMap<>();
                    CalificacionPruebas cf = new CalificacionPruebas();
                    Iterator it = ids2.iterator();
                    while (it.hasNext()) {
                        Object temp = it.next();
                        System.out.println("introduzca calificación para el aspirante " + temp + " (Solo calificaciones enteras. -1 para salir):");
                        int calif = teclado.nextInt();
                        List<Integer> calificaciones = new ArrayList<>();
                        while (calif != -1) {
                            calificaciones.add(calif);
                            calif = teclado.nextInt();
                            teclado.nextLine();
                        }
                        Integer id = (Integer) temp;
                        cf.InsertaCalificacion(id, calificaciones, mapaCalificaciones);
                    }
                    guardarFirchero(mapaCalificaciones);
                    System.out.println(frase_menu);
                    menu = teclado.nextInt();
                    teclado.nextLine();
                    break;
            case 3:
                Map<Integer, Aspirante> aspirantes2 = new LinkedHashMap<>();
                aspirantes2 = cargaAspirantes(aspirantes2);
                Map<Integer, List> mapaCalificaciones2 = new LinkedHashMap<>();
                mapaCalificaciones2 = cargaCalificaciones(mapaCalificaciones2);
                Set<Aspirante> aprobados = new TreeSet<>(new OrdenaAlfabetico());
                Aprobados apro = new Aprobados();
                Iterator iter = mapaCalificaciones2.keySet().iterator();
                while (iter.hasNext()) {
                    Integer key = (Integer) iter.next();
                    double media = apro.calcularMedia(mapaCalificaciones2.get(key));
                    if(media >= 5) {
                        Aspirante temp = aspirantes2.get(key);
                        temp.setMedia(media);
                        aprobados.add(aspirantes2.get(key));
                    }
                }
                apro.generarInforme(aprobados);
                System.out.println(frase_menu);
                menu = teclado.nextInt();
                teclado.nextLine();
                break;
            default:
                System.out.println("Opción no válida! Elija otra");
                System.out.println(frase_menu);
                menu = teclado.nextInt();
                teclado.nextLine();
                break;
        }
    }

        System.out.println("Hasta pronto!");
    }

    public static void guardarFircheros (Map<Integer, Aspirante> aspirantes, List ids){
        try (ObjectOutputStream fichero =
                     new ObjectOutputStream(new FileOutputStream("aspirantes.dat"))) {
            fichero.writeObject(aspirantes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream fichero =
                     new ObjectOutputStream(new FileOutputStream("ids_aspirantes.dat"))) {
            fichero.writeObject(ids);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Integer> cargaIds (List<Integer> ids) {
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("ids_aspirantes.dat"))) {
            ids = (List<Integer>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ids;
    }
    public static Map <Integer, Aspirante> cargaAspirantes (Map<Integer, Aspirante> aspirantes2) {
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("aspirantes.dat"))) {
            aspirantes2 = (Map<Integer, Aspirante>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return aspirantes2;
    }
    public static Map <Integer, List> cargaCalificaciones (Map<Integer, List> mapaCalificaciones2) {
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("calificaciones.dat"))) {
            mapaCalificaciones2 = (Map<Integer, List>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mapaCalificaciones2;
    }
    public static void guardarFirchero (Map<Integer, List> mapaCalificaciones) {
        try (ObjectOutputStream fichero =
                     new ObjectOutputStream(new FileOutputStream("calificaciones.dat"))) {
            fichero.writeObject(mapaCalificaciones);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
