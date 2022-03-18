package questaoDez;

import utils.UtilsTools;

import java.util.Random;

/*
    10.	Escreva um programa em Java que implemente o jogo conhecido como pedra,
        papel, tesoura. Neste jogo, o usuário e o computador escolhem entre pedra,
        papel ou tesoura. Sabendo que pedra ganha de tesoura, papel ganha de pedra e
        tesoura ganha de papel, exiba na tela o ganhador: usuário ou computador.
        Para essa implementação, assuma que o número 0 representa pedra, 1 representa
        papel e 2 representa tesoura. Para sortear a jogada do computador,
        adicione a seguinte função ao seu programa:

        A função randInt gera aleatoriamente um número entre min e max. Por exemplo,
        para sortear um número entre 0 e 2, a seguinte chamada deve ser realizada:
 */
public class Q10 {

    private UtilsTools ut;
    private int optionUser, computer;

    public Q10() {
        this.ut = new UtilsTools();
    }

    public void getOption() {
        System.out.println("Por favor, escolha uma opção\n\n0 - Pedra\n1 - Papel\n2 - Tesoura\n\nOpção:");
        this.optionUser = this.ut.getGetS().nextInt();

        this.computer = randInt(0, 2);

        if (this.optionUser == 0 && this.computer == 2) {
            System.out.println("Usuário: Pedra -- Computador: Tesoura\nUsuário venceu!");
        } else if (this.optionUser == 0 && this.computer == 1) {
            System.out.println("Usuário: Pedra -- Computador: Papel\nComputador venceu!");
        } else if (this.optionUser == 0 && this.computer == 0) {
            System.out.println("Usuário: Pedra -- Computador: Pedra\nEmpate!");
        } else if (this.optionUser == 1 && this.computer == 2) {
            System.out.println("Usuário: Papel -- Computador: Tesoura\nComputador venceu!");
        } else if (this.optionUser == 1 && this.computer == 0) {
            System.out.println("Usuário: Papel -- Computador: Pedra\nUsuário venceu!");
        } else if (this.optionUser == 1 && this.computer == 1) {
            System.out.println("Usuário: Papel -- Computador: Papel\nEmpate!");
        } else if (this.optionUser == 2 && this.computer == 1) {
            System.out.println("Usuário: Tesoura -- Computador: Papel\nUsuário venceu!");
        } else if (this.optionUser == 2 && this.computer == 0) {
            System.out.println("Usuário: Tesoura -- Computador: Pedra\nComputador venceu!");
        } else if (this.optionUser == 2 && this.computer == 2) {
            System.out.println("Usuário: Tesoura -- Computador: Tesoura\nEmpate!");
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

}
