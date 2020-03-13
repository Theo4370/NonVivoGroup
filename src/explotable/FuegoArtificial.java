package explotable;

public class FuegoArtificial implements Explotable {

    private String ruido;

    public FuegoArtificial(String unRuido){
        this.ruido = unRuido;
    }

    @Override
    public void explotar() {
        System.out.println(ruido);
    }
}
