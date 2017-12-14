
package practica.modelo;

public class Registro {
    
    private int id;
    private Parqueadero parquedero;
    private Auto auto;
    private String fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Parqueadero getParquedero() {
        return parquedero;
    }

    public void setParquedero(Parqueadero parquedero) {
        this.parquedero = parquedero;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return id + " | " + parquedero.getNombre() + " | " + auto.getPlaca() + " | " + fecha + '}';
    }
    
}
