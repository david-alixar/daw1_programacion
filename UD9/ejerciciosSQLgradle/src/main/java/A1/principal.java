package A1;

public class principal {
  public static void main(String[] args) {
    //
    ADClassicModels ad1 = new ADClassicModels();
    System.out.println("Listado de empleados: \n");
    System.out.println(ad1.getEmpleados()+"\n");
    System.out.println("Listado de oficinas: \n");
    System.out.println(ad1.getOffices());
    ConexionDB.close();
  }
}
