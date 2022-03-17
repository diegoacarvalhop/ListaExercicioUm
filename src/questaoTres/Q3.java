package questaoTres;

import utils.UtilsTools;

/*
3.	Faça um programa em java para calcular quantas ferraduras são necessárias
    para equipar todos os cavalos comprados para um haras. A informação de cavalos
    comprados deve ser informada pelo usuário.
*/
public class Q3 {

    private UtilsTools ut;
    private int horses, qttHorseshoes;
    private final int HORSESHOES = 4;

    public Q3() {
        this.ut = new UtilsTools();
    }

    public void getHorses() {
        System.out.println("Por favor, informe a quantidade de cavalos:");
        this.horses = this.ut.getGetS().nextInt();

        calculateHorseshoes(this.horses);
    }

    private void calculateHorseshoes(int horses) {
        this.qttHorseshoes = horses * this.HORSESHOES;
        System.out.println("A quantidade de ferraduras necessárias para " + this.horses + " é de " + this.qttHorseshoes);
    }

}
