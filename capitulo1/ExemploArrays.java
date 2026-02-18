package capitulo1;

import java.text.DecimalFormat;

public class ExemploArrays {
    int numerosInteiros[];
    double[] numerosReais;

    static final int TAMANHO = 20;

    static public void main(String[] java) {
        ExemploArrays prog = new ExemploArrays();

        // Criando um array de inteiros com 20 posições
        prog.numerosInteiros = new int[TAMANHO];

        // Criando um array de doubles com 20 posições
        prog.numerosReais = new double[TAMANHO*2];

        // Preenchendo o array de inteiros
        for (int i = 0; i < TAMANHO; i++) {
            prog.numerosInteiros[i] = (int)(Math.random() * 10); // Atribui um número aleatório entre 0 e 9
            prog.numerosReais[i] = Math.random() * 10; // Atribui um número aleatório entre 0 e 9
        }

        System.out.print("Números inteiros aleatórios: ");

        for (int i=0; i < TAMANHO; i++)
            System.out.print(prog.numerosInteiros[i] + " - ");

        DecimalFormat formatacao = new DecimalFormat("0.00");
        System.out.print("\nNúmeros reais aleatórios: ");
        for (int i=0; i < TAMANHO; i++)
            System.out.print(formatacao.format(prog.numerosReais[i]) + " - ");
    }
}