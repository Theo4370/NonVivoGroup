import explotable.Explotable;
import invitado.Invitado;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private List<Explotable> listaDeExplotables;
    private List<Invitado> listaDeInvitados;

    public Evento(){
        listaDeExplotables = new ArrayList<>();
        listaDeInvitados = new ArrayList<>();
    }


    public void encenderVelas(){
        explotarFuegosArtificiales();
        repartirTorta();
    }

    private void explotarFuegosArtificiales(){
        for (Explotable unExplotable : listaDeExplotables) {
            unExplotable.explotar();
        }
    }

    private void repartirTorta(){
        for (Invitado unInvitado : listaDeInvitados) {
            unInvitado.comer();
        }
    }


    public void agregarInvitado(Invitado unInvitado){
        this.listaDeInvitados.add(unInvitado);
    }

    public void agregarExplotable(Explotable unExplotable){
       this.listaDeExplotables.add(unExplotable);
    }


}
