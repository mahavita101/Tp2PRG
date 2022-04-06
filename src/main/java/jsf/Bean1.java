package jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "bean1")
@RequestScoped
public class Bean1 {

    /**
     * Creates a new instance of bean1
     */
    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }
    public String afficher() {
    return "affichage_4?nb="+ nombre + "&amp;faces-redirect=true";
    }
    public String afficherTemplate() {
    return "affichage__4?nb="+ nombre + "&amp;faces-redirect=true";
    }
    
}