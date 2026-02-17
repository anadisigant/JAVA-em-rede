package capitulo1;

import java.text.DecimalFormat;

public class ExemploClasses {

    // Duas variáveis de instância do tipo Calculadora.
    // calc será inicializada imediatamente.
    // calc2 começa como null.
    private Calculadora calc, calc2 = null;

    public ExemploClasses(int valor) {

        // Cria o primeiro objeto Calculadora (Objeto A)
        calc = new Calculadora();

        // Chama somar(a, b)
        // resultado interno de calc passa a ser valor + 6
        System.out.println(valor + " mais 6 é " + calc.somar(valor, 6));

        // Chama somar(a)
        // resultado interno de calc passa a ser valor + valor
        System.out.println(valor + " vezes 2 é " + calc.somar(valor));

        // Cria o segundo objeto Calculadora (Objeto B)
        calc2 = new Calculadora();

        // calc3 NÃO cria um novo objeto.
        // Apenas copia a referência.
        // calc2 e calc3 apontam para o mesmo objeto (Objeto B).
        Calculadora calc3 = calc2;

        // Chama subtrair(a, b)
        // resultado interno do Objeto B passa a ser 9 - valor
        System.out.println("9 menos " + valor + " é " + calc2.subtrair(9, valor));

        // Formatação para exibir duas casas decimais
        DecimalFormat saida = new DecimalFormat("0.00");

        // Chama quadrado(a)
        // Resultado interno recebe apenas "a"
        // O retorno é Math.pow(resultado, 2)
        // Ou seja:
        // resultado interno = valor
        // valor retornado = valor²
        System.out.println(valor + " vezes " + valor + " é "
                + saida.format(calc2.quadrado(valor)));

        // Aqui exibimos o valor do atributo "resultado" de cada objeto.

        // calc.resultado: último valor armazenado no Objeto A
        // calc2.resultado: valor armazenado no Objeto B
        // calc3.resultado: mesmo valor do Objeto B (mesma referência)

        System.out.println("Ao final, o valor da variável \"resultado\" é "
                + calc.resultado + ", "
                + calc2.resultado + " e "
                + calc3.resultado);
    }

    public static void main(String[] args) {

        // Cria uma instância da classe passando 58 como argumento
        new ExemploClasses(58);
    }
}

class Calculadora {

    // Variável de instância.
    // Cada objeto Calculadora possui sua própria cópia.
    public double resultado = 0;

    // Soma dois valores e armazena no atributo resultado
    public double somar(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    // Sobrecarga do método ao somar o valor com ele mesmo   
    protected double somar(double a) {
        resultado = a + a;
        return resultado;
    }

    // Subtração simples
    protected double subtrair(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    // Calcula o quadrado
    protected double quadrado(double a) {

        // Atualiza o estado interno apenas com "a"
        resultado = a;

        // Retorna o quadrado, mas NÃO altera resultado para o quadrado
        return Math.pow(resultado, 2);
    }
}