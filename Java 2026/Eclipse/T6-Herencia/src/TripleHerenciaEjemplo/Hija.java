package TripleHerenciaEjemplo;

public class Hija extends Padre {
    String nombre = "Hija Ana";

    public void mostrarNombres() {
        // 1. 'this' hace referencia a este mismo objeto (Hija).
        // Busca la variable 'nombre' declarada dentro de la propia clase Hija.
        System.out.println("Desde Hija: " + this.nombre); // Imprime: Hija Ana

        // 2. 'super' sube un nivel en la herencia (a la clase Padre).
        // Busca la variable 'nombre' declarada en Padre, ignorando la de Hija.
        System.out.println("Desde Padre: " + super.nombre); // Imprime: Padre Juan

        // 3. Como en Java NO existe 'super.super', hacemos un casting (conversión):
        // - '(Abuelo) this' le dice a Java: "mira este objeto Hija como si fuera un Abuelo".
        // - Los paréntesis exteriores '((Abuelo) this)' son obligatorios para que Java haga
        //   primero el cambio de tipo y LUEGO acceda a '.nombre'.
        
        /*
         *  ¿Qué significa ((Abuelo) this).nombre paso a paso?
         *    - this: Significa "este mismo objeto" (la instancia actual de Hija que ejecuta el código).
         *    - (Abuelo) this: Le dice a Java: "Trata a este objeto Hija como si fuera un objeto de tipo Abuelo".
         *    - Los paréntesis exteriores ((Abuelo) this): Son obligatorios porque el punto (.) tiene más
         *      prioridad que el casting. Si pusieras (Abuelo) this.nombre, Java intentaría convertir el
         *      texto 'nombre' en un Abuelo y daría error de compilación.
         *    - .nombre: Al estar mirando ya el objeto "con gafas de Abuelo", Java busca directamente la
         *      variable 'nombre' declarada dentro de la clase Abuelo.
         *      No puedo quitar el punto, por ejemplo si queremos acceder a un método ponemos x.atributo
         *      aquí pasa exactamente igual, pero primero hay que hacer el casting.
         */
        System.out.println("Desde Abuelo (con casting): " + ((Abuelo) this).nombre); // Imprime: Abuelo Pepe

        // 4. FORMA ALTERNATIVA (hace exactamente lo mismo que la línea anterior, pero más visual):
        // Guardamos una referencia de este objeto ('this') en una variable de tipo 'Abuelo'.
        // Java lo permite porque toda Hija ES un Abuelo (por herencia).
        Abuelo yoComoAbuelo = this;

        // Al usar una variable de tipo 'Abuelo', Java busca el atributo 'nombre' directamente en Abuelo.
        System.out.println("Desde Abuelo (en 2 líneas): " + yoComoAbuelo.nombre); // Imprime: Abuelo Pepe
    }
    
    // Hereda el método revelarSecreto(), pero NO puede ver secretoDelAbuelo()
    
    public void intentarAcceder() {
        /*
         * ❌ ERROR DE COMPILACIÓN:
         * Aunque hagas casting a Abuelo, sigues escribiendo código desde dentro de Hija.
         * Java bloquea el acceso porque secretoDelAbuelo() es 'private'.
         */
        // ((Abuelo) this).secretoDelAbuelo(); // <-- Si quitas las barras '//', dará error en rojo

        /*
         * ✅ FORMA CORRECTA:
         * Llamamos al método 'protected' (o 'public') que hace de puente en Abuelo.
         * (Aquí ni siquiera hace falta el casting, con 'this.revelarSecreto()' o 'super.revelarSecreto()' basta).
         */
        ((Abuelo) this).revelarSecreto();
    }
}
