public class televisor {

    private int canal;
    private int volumen;
    private int color;

    public televisor(){

        canal = 1;
        volumen = 5;
        color = 7;

    }

    public televisor(int numeroCanal){

        color = 7;
        volumen = 5;
        setCanal(numeroCanal);
        
    }

    public void subirColor(){

        setColor(color +1);
    }

    public void bajarColor(){

        setColor(color -1);
    }

    public void setColor(int valorColor){
        if(valorColor >=1 && valorColor <=7)
        color = valorColor;
        estadoToString(volumen, canal, color);
    }

    public void subirVolumen(){

        setVolumen(volumen +1);
    }

    public void bajarVolumen(){

        setVolumen(volumen -1);
    }

    public void setVolumen(int numeroVolumen){

        if(numeroVolumen >= 0 && numeroVolumen <=100)
        volumen = numeroVolumen;
        estadoToString(volumen, canal, color);
    }

    public void setCanal(int numeroCanal){

        if(numeroCanal < 1)
        canal = 1;
        else if(numeroCanal > 99)
        canal = 99;
        else
        canal = numeroCanal;
        estadoToString(volumen, canal, color);
    }

    public void subirCanal(){
        setCanal(canal + 1);

    }

    public void bajarCanal(){
        setCanal(canal -1);
    }

    public int getCanal(){
        return canal;
    }

    public int getVolumen(){
        return volumen;
    }

    public int getColor(){
        return color;
    }

    public void estadoToString (int volumenCanal, int numeroCanal, int valorColor){
        System.out.println("Estás en el canal: " + getCanal() +" y con nivel de volumen: " +getVolumen()+" y color: "+getColor());
    }
    
}
