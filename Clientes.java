
public class Clientes{
    private String Nombre;
    private int Numfam;
    private String Tipo;

     public Clientes(String Nombre, int Numfam, String Tipo) {
        this.Nombre = Nombre;
        this.Numfam = Numfam;
        this.Tipo = Tipo;
    }

        
    public String getNombre() {
        return Nombre;
    }

    public int getNumfam() {
        return Numfam;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }


}