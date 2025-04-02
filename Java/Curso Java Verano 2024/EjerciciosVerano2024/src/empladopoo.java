public class empladopoo {

    public static void main(String[] args) {
        
    Empleado e1 = new Empleado("Daniel",5,1500);
    Empleado e2 = new Empleado("Pepe");
    Empleado e3 = new Empleado("José",3);
    Empleado e4 = new Empleado("Dua",18);
    Empleado e5 = new Empleado();

        e1.EmpleadoToString();
        e2.EmpleadoToString();
        e3.EmpleadoToString();
        e4.EmpleadoToString();
        e5.EmpleadoToString();

        e1.subirSalario(5);
        e1.EmpleadoToString();

        e1.mostrarRango();
        e2.mostrarRango();
        e3.mostrarRango();
        e4.mostrarRango();
        
        

    }
    
}
