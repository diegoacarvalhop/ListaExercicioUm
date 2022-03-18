package questaoTreze;

import utils.UtilsTools;

/*
    13.	Escreva um programa em Java que leia dois números representando os limites
    inferior e superior de um intervalo de números inteiros. Em seguida, o programa
    deve calcular e exibir na tela as seguintes informações:
    ○	A soma dos inteiros que estão no intervalo;
    ○	O número de inteiros dentro do intervalo;
    ○	O número de inteiros ímpares do intervalo;
    ○	Para cada número do intervalo, a indicação se ele é par ou ímpar.
 */
public class Q13 extends UtilsTools {

    private int inferiorLimit, upperLimit;

    public void getLimits() {
        System.out.println("Por favor, informe um valor para o limite inferior:");
        this.inferiorLimit = getGetS().nextInt();

        System.out.println("Por favor, informe um valor para o limite superior:");
        this.upperLimit = getGetS().nextInt();

        calculateSumIntegers(this.inferiorLimit, this.upperLimit);
        calculateIntervalIntegers(this.inferiorLimit, this.upperLimit);
        calculateOddIntegers(this.inferiorLimit, this.upperLimit);
        calculateOddOrEvenIntegers(this.inferiorLimit, this.upperLimit);
    }

    private void calculateSumIntegers(int inferiorLimit, int upperLimit) {
        int soma = 0;
        while (inferiorLimit < upperLimit) {
            soma += inferiorLimit++;
        }
        System.out.println("A soma dos inteiros que estão no intervalo: " + soma);
    }

    private void calculateIntervalIntegers(int inferiorLimit, int upperLimit) {
        int i = 0;
        while (inferiorLimit < upperLimit) {
            inferiorLimit++;
            i++;
        }
        System.out.println("O número de inteiros dentro do intervalo: " + i);
    }

    private void calculateOddIntegers(int inferiorLimit, int upperLimit) {
        int i = 0;
        while (inferiorLimit < upperLimit) {
            inferiorLimit++;
            if (inferiorLimit % 2 != 0) {
                i++;
            }
        }
        System.out.println("O número de inteiros ímpares do intervalo: " + i);
    }

    private void calculateOddOrEvenIntegers(int inferiorLimit, int upperLimit) {
        int i = 0;
        while (inferiorLimit < upperLimit) {
            if (inferiorLimit % 2 == 0) {
                System.out.println("O número " + inferiorLimit + " é par.");
            } else {
                System.out.println("O número " + inferiorLimit + " é ímpar.");
            }
            inferiorLimit++;
        }
    }

}
