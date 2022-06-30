package excepcoes.src.ex4;

public class ExperimentaExcepcoes {
    public static void main(String[] args) {
        // testar o método getValueAt
/*        int[] numeros = {45, 29, 10, 21, 68};
        printValueAt(0, numeros);
        printValueAt(10, numeros);
        printValueAt(3, numeros);

        printValueAt(3, null);
*/
        // teste aqui o método divide
        divide(10,2);
        divide(1,1);
        divide(50,0);

    }

    public static void printValueAt(int index, int[] someArray) {


        try {
            if (someArray != null) {
                System.out.println(someArray[index]);
            } else {
                throw new IllegalArgumentException();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Selecione uma posição válida no Array");
        }catch (IllegalArgumentException e){
            System.out.println("O array de inteiros não pode ser nulo!");
        }

    }

    // implemente aqui o método divide
    public static void divide ( int x, int y) {
        try {
            System.out.println("Resultado de " + x + "/" + y + " = " + (x / y));

        } catch (ArithmeticException e) {
            System.out.println("Impossível dividir por 0");

        // o que finally basicamente executa código no final, quer tenha havido excepcoes ou nao
        } finally {
            System.out.println("Processo terminou");

        }
    }
}
