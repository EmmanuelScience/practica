package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Galeria {
    ArrayList<ObraArte> obras;

    public Galeria() {
        obras = new ArrayList<>();
    }

    public void addObra(ObraArte obra) {
        obras.add(obra);
    }

    public ObraArte getObraId(int id) {
        for (int i = 0; i < obras.size(); i++) {
            if (obras.get(i).getId() == id) {
                return obras.get(i);
            }
        }
        return null;
    }

    public ArrayList<ObraArte> getObras() {
        return obras;
    }

    public ObraArte getObraNombre(String nombre) {
        for (int i = 0; i < obras.size(); i++) {
            if (obras.get(i).getNombre().equals(nombre)) {
                return obras.get(i);
            }
        }
        return null;
    }

    public void setObras(ArrayList<ObraArte> obras) {
        this.obras = obras;
    }
}
