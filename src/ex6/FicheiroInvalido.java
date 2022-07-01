package excepcoes.src.ex6;

public class FicheiroInvalido extends Exception{
    private String erro;
    private String ficheiro;

    public FicheiroInvalido (String erro, String ficheiro){
        this.erro=erro;
        this.ficheiro=ficheiro;
    }

    public String getFicheiro() {
        return ficheiro;
    }
}
