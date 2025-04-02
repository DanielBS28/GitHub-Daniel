public class stringconbordesejercicio2 {

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

    static void imprimirArray(int [] enteros){
    
        imprimirBordeSup(enteros);
        imprimirMedio(enteros);
        imprimirBordeInf(enteros);
    }

    static void imprimirBordeSup (int [] enteros){
        imprimirBordes(BORDE_SUP, enteros);
    }

    static void imprimirBordeInf (int [] enteros){
    imprimirBordes(BORDE_INF, enteros);
    }

    static int comprobarTamaño(int numero){

        int tamaño = 0;

        if(numero == 0)
        tamaño = 1;

        while(numero != 0){
            numero /= 10;
            tamaño++;
        }
        

        return tamaño;
    }

    static void imprimirBordes( int tipoborde, int [] enteros){

       System.out.print(tipoborde == 0 ? ESQUINA_SUP_IZQ: ESQUINA_INF_IZQ);

        for (int i = 0; i < enteros.length; i++) {
            
            int lineas = comprobarTamaño(enteros[i]) + 2;

            if(enteros[i]<0)
            lineas++; 
            for (int j = 0; j<lineas; j++) {
                
                System.out.print(LINEA_HORIZONTAL);
            }  
            if (i < enteros.length - 1)
            System.out.print(tipoborde == 0 ? SEPARADOR_SUP: SEPARADOR_INF);
            
        }


        System.out.println(tipoborde == 0 ? ESQUINA_SUP_DER : ESQUINA_INF_DER);
    }

    static void imprimirMedio (int [] enteros){
        System.out.print(LINEA_VERTICAL);
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(" " + enteros[i] + " " + LINEA_VERTICAL);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        int [] enteros = {1,-345,456,8765};

        imprimirArray(enteros);

    }
    
}
