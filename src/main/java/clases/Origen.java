package clases;

import java.io.Serializable;

public class Origen extends Ciudades implements Serializable {

    public Origen() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Origen(String _descripcion) {
        super(_descripcion);
        // TODO Auto-generated constructor stub
    }

    public Origen(int _codigo, String _descripcion) {
        super(_codigo, _descripcion);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Ciudad de Origen: " + super.toString();
    }

}
