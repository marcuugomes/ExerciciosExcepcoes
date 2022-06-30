package excepcoes.src.ex3;

public class Temperatura {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        //---------------------------------------------------------------------------------
        /* 3- b) Está comentado porque no 3-d) é necessário alterar o bloco de código

        if (aFahrenheit < absoluteZeroFahrenheit) {
            throw (new TemperaturaException("O valor está abaixo do zero absoluto!"));
        }
        */
        //---------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------

        /* 3-d) Com try e catch, assim conseguimos lidar com a exepcao no 'catch' */
        try {
            if (aFahrenheit < absoluteZeroFahrenheit) {
                throw new TemperaturaException();
            }
            fahrenheit = aFahrenheit;
        } catch (TemperaturaException e){
            System.out.println("O valor está abaixo do zero absoluto!");
        }

    }
}
