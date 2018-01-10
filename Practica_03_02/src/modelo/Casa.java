package modelo;

/**
 *
 * @author JonnathanMatute
 */
public class Casa {

    private int id;
    private String direccion;
    private String numeroDeCasa;
    private Propietario propietario;

    public Casa(int id, String direccion, String numeroDeCasa, Propietario propietario) {
        this.id = id;
        this.direccion = direccion;
        this.numeroDeCasa = numeroDeCasa;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroDeCasa() {
        return numeroDeCasa;
    }

    public void setNumeroDeCasa(String numeroDeCasa) {
        this.numeroDeCasa = numeroDeCasa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", direccion=" + direccion + ", numeroDeCasa=" + numeroDeCasa + ", propietario=" + propietario + '}';
    }
}
