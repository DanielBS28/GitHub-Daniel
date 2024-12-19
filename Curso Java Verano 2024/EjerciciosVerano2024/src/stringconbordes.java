
public class stringconbordes {

    private static final char LINEA_VERTICAL = '║';
    private static final char LINEA_HORIZONTAL = '═';
    private static final char ESQUINA_SUP_IZQ = '╔';
    private static final char ESQUINA_INF_IZQ = '╚';
    private static final char ESQUINA_SUP_DER = '╗';
    private static final char ESQUINA_INF_DER = '╝';
    private static final char SEPARADOR_SUP = '╦';
    private static final char SEPARADOR_INF = '╩';
    private static final char SEPARADOR_IZQ = '╠';
    private static final char SEPARADOR_DER = '╣';
    private static final char SEPARADOR_CRUZ = '╬';
    private static final char SEPARADOR_FILAS_MATRICES = '■';
    private static final int BORDE_SUP = 0;
    private static final int BORDE_INF = 1;

    static void imprimirFrase(String frase){

        String [] lineas = frase.split("\n");

        int maximo = fraseGrande(lineas);
        
        imprimirArriba(frase, maximo);
        imprimirMedio(lineas, maximo);
        imprimirAbajo(frase, maximo);
        
    }

    static int fraseGrande (String [] lineas){

        int max = lineas[0].length();

        for (int i = 0; i < lineas.length - 1; i++) {
            if(lineas[i].length() < lineas[i+1].length())
            max = lineas[i+1].length();
        }

        return max;
    }
    static void imprimirArriba(String frase, int maximo){
        System.out.print(ESQUINA_SUP_IZQ);

        for(int i= 0; i<(maximo*2) + 2 + 1; i++){

            System.out.print(LINEA_HORIZONTAL);
        }

        System.out.print(ESQUINA_SUP_DER);
    }

    static void imprimirMedio (String [] lineas, int maximo){
        System.out.println();
        

        for (int i = 0; i < lineas.length; i++) {

            System.out.print(LINEA_VERTICAL + "  ");

            for (int j = 0; j < maximo; j++) {

                if( j < lineas[i].length())
                System.out.print(lineas[i].charAt(j)+" ");
                else
                System.out.print("  ");
            }
            System.out.print(" "+LINEA_VERTICAL);
            System.out.println();
            

        }
        
    }

    static void imprimirAbajo(String frase, int maximo){
        System.out.print(ESQUINA_INF_IZQ);

        for(int i= 0; i<(maximo*2) + 2 + 1; i++){

            System.out.print(LINEA_HORIZONTAL);
        }

        System.out.print(ESQUINA_INF_DER);
    }

    public static void main(String[] args) {


    String titulo = "Hola me llamo Daniel";
    titulo = titulo.toUpperCase();

    String texto = """
            Hola me llamo Daniel
            y estoy en el pueblo,
            Espinoso del Rey
            """;
    

    imprimirFrase(titulo);
    System.out.println();
    imprimirFrase(texto);
    }

   
}