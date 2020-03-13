package explotable;

import java.util.ArrayList;
import java.util.List;

public class Pack implements Explotable {

    private List<Explotable> listaDeExplotables;

    public Pack(){
        this.listaDeExplotables = new ArrayList<>();
    }


    @Override
    public void explotar() {
        for (Explotable unExplotable : listaDeExplotables) {
            unExplotable.explotar();
        }
    }

    public void agregarExplotable(Explotable unExplotable){
        this.listaDeExplotables.add(unExplotable);
    }
}
