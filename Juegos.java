package extraerDatos;

/*
    Edison Rivera
    Estela Chipantasi
 */

public class Juegos {
    private String nombre;
    private String categoria;
    private String publico;

    public String toString(){
        return "- Nombre: " + this.nombre + "\n- Categoria: " + this.categoria + "\n- Publico: " +
                this.publico;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setCategoria (String categoria){
        this.categoria = categoria;
    }

    public void setPublico (String publico){
        this.publico = publico;
    }
}
