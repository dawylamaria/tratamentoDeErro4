public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int resultado = num1 / num2;
            System.out.println(resultado);
        } catch (ArithmeticException e){
            System.err.println("Nao é possivel dividir por zero!");
        }

    }
}