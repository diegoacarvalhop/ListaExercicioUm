package questaoQuatorze;

import utils.UtilsTools;

/*
    14.	Escreva um programa em Java que implemente o jogo da senha (para 2 pessoas):
        ○	O jogador 1 digita uma senha (valor inteiro entre 0 e 100) sem o conhecimento do jogador 2;
        ○	O jogador 2 tem 5 chances para descobrir a senha;
        ○	A cada tentativa do jogador 2, o programa deve avisar se o valor digitado é maior, menor ou
            igual a senha;
        ○	Se o jogador 2 acertar a senha, o programa não deve pedir mais nenhuma tentativa.
        ○	Se o valor digitado em uma tentativa tiver uma diferença igual a 1 para a senha, o
            programa deve avisar que “TÁ QUENTE!”. Neste caso, nenhuma outra mensagem deve ser emitida.
            Nos demais casos, continuam valendo as mensagens exibidas no exercício anterior. Exemplos:
            ■	 senha 43 e valor digitado 42 : TÁ QUENTE!!!
	        ■    senha 43 e valor digitado 44 : TÁ QUENTE!!!;
        ○	Ao final do jogo, se for o caso, exiba a mensagem “Você perdeu. Tente novamente depois”;
        ○	Não permita que o jogador 1 digite valores fora da faixa esperada (entre 0 e 100);
        ○	Ao final de uma partida, permita que o usuário jogue novamente.
 */
public class Q14 extends UtilsTools {

    private int userA, userB, playAgain;

    public void getNumberUsers() {
        do {
            System.out.println("Usuário 1: Favor informar um número entre 0 e 100:");
            this.userA = getGetS().nextInt();
            if (this.userA < 0 && this.userA > 100) {
                System.out.println("Favor informar um número entre 0 e 100. Informe um novo número!");
            }
        } while (this.userA >= 0 && this.userA <= 100);

        int cont = 1;

        do {
            do {
                System.out.println("Usuário 2 (Tentativa " + cont + "): Favor informar um número entre 0 e 100: ");
                this.userB = getGetS().nextInt();
                if (this.userB < 0 && this.userB > 100) {
                    System.out.println("Favor informar um número entre 0 e 100. Informe um novo número!");
                }
            } while (this.userB >= 0 && this.userB <= 100);

            if (cont <= 5) {
                if (this.userB > this.userA) {
                    System.out.println("O número é maior. Tente novamente!");
                } else if (this.userB < this.userA) {
                    System.out.println("O número é menor. Tente novamente!");
                } else if (this.userB == this.userA) {
                    System.out.println("O número é igual!");
                } else if (this.userB == this.userA - 1 || this.userB == this.userA + 1) {
                    System.out.println("TÁ QUENTE!!!");
                }
            } else {
                System.out.println("Você perdeu. Tente novamente depois.");
            }
            cont++;
        } while (cont <= 5);

        System.out.println("Deseja jogar novamente? (1 - Sim / 2 - Não)");
        this.playAgain = getGetS().nextInt();

        if(this.playAgain == 1) {
            getNumberUsers();
        } else {
            System.out.println("Até a próxima!!!");
        }
    }
}
