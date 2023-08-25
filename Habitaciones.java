/**
  * Random
 
  * @param String, float, int, boolean 
  * @throws Se pide el precio, el tipo de habitación, capacidad y si está ocupada o vacía

  */
public class Habitaciones {
    private String tipohabit;
    private float precio;
    private int capacidad;
    private boolean ocupada;

    public Habitaciones(String tipohabit, float precio, int capacidad, boolean ocupada) {
        this.tipohabit = tipohabit;
        this.precio = precio;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
    }

    public String getTipohabit() {
        return tipohabit;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean puedeOcupar(String tipoCliente) {
        if (tipohabit.equals("Normal")) {
            return true;
        } else if (tipohabit.equals("Deluxe")) {
            return tipoCliente.equals("Frecuente") || tipoCliente.equals("VIP");
        } else if (tipohabit.equals("Suite")) {
            return tipoCliente.equals("VIP");
        }
        return false;
    }
}