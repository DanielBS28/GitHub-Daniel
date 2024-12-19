public class Empleado{

    private String nombreCompleto;
    private int añosExp;
    private double salario;

    public Empleado(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
        salario = 1000;
    }

    public Empleado(String nombreCompleto, int añosExp){

        this.nombreCompleto = nombreCompleto;
        salario = 1300;
        this.añosExp = añosExp;

    }

    public Empleado(String nombreCompleto, int añosExp, double salario){

        this.nombreCompleto = nombreCompleto;
        this.salario = salario;
        this.añosExp = añosExp;

    }
    public Empleado(){}

    public void mostrarRango(){
        if(añosExp<=3)
        System.out.print("El empleado: "+ nombreCompleto +" es Principiante");
        else if(añosExp<18)
        System.out.print("El empleado: "+ nombreCompleto +" es Intermedio");
        else 
        System.out.print("El empleado: "+ nombreCompleto +" es Senior");

        System.out.println();
    }

    public String getNombre(){
        return nombreCompleto;
    }
    public int getAñosExp(){
        return añosExp;
    }
    public double getSalario(){
        return salario;
    }

    public void EmpleadoToString(){
        System.out.println("Nombre completo: "+getNombre());
        System.out.println("Años de experiencia: "+getAñosExp());
        System.out.println("Salario: "+getSalario());
        System.out.println("---------------------------------");
    }

    public void subirSalario(int porcentaje){

        salario = salario + (porcentaje*salario/100);
    }



}