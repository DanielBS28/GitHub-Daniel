package SucursalBancariaEjercicio;


import java.time.LocalDateTime;

public class Movimiento {
    
    // Constantes para identificar el tipo de movimiento
    public static final byte INGRESO = 0;
    public static final byte RETIRO = 1; // Cambiado a 1 por buena práctica

    private LocalDateTime fechaHora;
    private double importe;
    private byte tipo;
    
    // Constructor de la clase Movimiento
    public Movimiento(LocalDateTime fechaHora, double importe, byte tipo) {
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.tipo = tipo;
    }
    
    // Métodos Getters por si necesitas consultar los datos desde la cuenta o el exterior
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public double getImporte() {
        return importe;
    }

    public byte getTipo() {
        return tipo;
    }
}
