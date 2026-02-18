package capitulo1;

public class DivisaoPorZero {
    public static void main(String[] args) {
        new DivisaoPorZero().calcularComTratamento();
        new DivisaoPorZero().calcular();

        System.out.println("Programa encerrado");
    }

    public void calcularComTratamento() {
        try {
            System.out.println("Divisão de 5 por 0 é " + 5/0); //Essa mensagem não deve aparecer na tela
        } catch (java.lang.ArithmeticException exc) {
            System.err.println ("Não é possível dividir por zero");
        }
    }

    public void calcular() {
        System.out.println("Divisão de 5 por 0 é " + 5/0); //Essa mensagem não deve aparecer na tela
    }
}
