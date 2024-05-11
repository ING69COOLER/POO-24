package co.edu.uniquindio.poo;

public class Publicacion {
    private String titulo;
    private String texto;
    private TipoPublicacion tipoPublicacion;
    public Publicacion(String titulo, String texto, TipoPublicacion tipoPublicacion) {
        this.titulo = titulo;
        this.texto = texto;
        this.tipoPublicacion = tipoPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public TipoPublicacion getTipoPublicacion() {
        return tipoPublicacion;
    }
    public void setTipoPublicacion(TipoPublicacion tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }
    @Override
    public String toString() {
        return "Publicacion [titulo=" + titulo + ", texto=" + texto + ", tipoPublicacion=" + tipoPublicacion + "]";
    }
    
    
}
