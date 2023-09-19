package co.com.proyectobase.tu.model;

public class DatosUsuario {

    private String producto;
    private String nombre;

    public DatosUsuario(String producto, String nombre, String pais, String ciudad, String numTarjeta, String mes, String anno) {
        this.producto = producto;
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.numTarjeta = numTarjeta;
        this.mes = mes;
        this.anno = anno;
    }

    private String pais;
    private String ciudad;
    private String numTarjeta;
    private String mes;
    private String anno;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }
}
