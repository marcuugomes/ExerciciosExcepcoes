package excepcoes.src.ex6;

import java.util.HashMap;

public class TesteAvaliaSoftware {
    public static void main(String[] args) {

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // teste aqui o método checkFileExtension
        AvaliaSoftware.checkFileExtension("Coolasdasdasdasd.java");
    }
}
