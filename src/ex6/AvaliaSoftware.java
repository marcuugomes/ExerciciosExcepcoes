package excepcoes.src.ex6;

public class AvaliaSoftware {

    public static int checkFileExtension(String ficheiro){

        int pont=0;

        String[] split = ficheiro.split("\\.");

        if (ficheiro.equals(null)){
            pont-=1;


        } else {
            if (split[1].equals("java")) {
                pont += 1;
            }
        }
        return pont;
    }
}
