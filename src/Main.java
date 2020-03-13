import explotable.Explotable;
import explotable.FuegoArtificial;
import explotable.Pack;
import invitado.Invitado;
import invitado.InvitadoDH;
import invitado.InvitadoStandard;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //1 Creamos el evento
        Evento unEvento = new Evento();

        //2 Creamos 3 invitados
        Invitado unInvitado = new InvitadoStandard();
        Invitado otroInvitado = new InvitadoStandard();
        Invitado pat = new InvitadoDH();

        //3) Agregamos los invitados al evento.
        unEvento.agregarInvitado(unInvitado);
        unEvento.agregarInvitado(otroInvitado);
        unEvento.agregarInvitado(pat);

        //4 Crear Explotables
        Explotable unExplotable = new FuegoArtificial("chaski boom");
        Explotable otroExplotable = new FuegoArtificial("KABOOM");
        Explotable unTerceExplotable = new FuegoArtificial("POOM ");
        Pack unPack = new Pack();
        unPack.agregarExplotable(unExplotable);
        unPack.agregarExplotable(otroExplotable);
        Pack otroPack = new Pack();
        otroPack.agregarExplotable(unPack);
        otroPack.agregarExplotable(unTerceExplotable);
        //5 agregar los explotables al evento

        unEvento.agregarExplotable(unPack);
        unEvento.agregarExplotable(otroPack);
        unEvento.agregarExplotable(unTerceExplotable);

        //6 soplar la vela
        unEvento.encenderVelas();

    }
}
