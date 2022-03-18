package questaoDezeseis;

import utils.UtilsTools;

import java.util.List;

/*
    16.	Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
        de 10 pessoas. Fazer um algoritmo que calcule e escreva:
        ○	a maior e a menor altura do grupo;
        ○	média de altura dos homens;
        ○	o número de mulheres.
 */
public class Q16 extends UtilsTools {

    private double height;
    private Character sex;

    public Q16(double height, char sex) {
        this.height = height;
        this.sex = sex;
    }

    private void getGreaterAndLesserHeight(List<Q16> listPeoples){
        double auxGreater = 0;
        for (int i = 0; i < listPeoples.size(); i ++){
            if (listPeoples.get(i).getHeight() > auxGreater){
                auxGreater = listPeoples.get(i).getHeight();
            }
        }

        double auxLesser = listPeoples.get(0).getHeight();
        for (int i = 0; i < listPeoples.size(); i ++){
            if (listPeoples.get(i).getHeight() < auxLesser){
                auxLesser = listPeoples.get(i).getHeight();
            }
        }

        System.out.println("A maior altura é: " + auxGreater + "\nA menor altura é: " + auxLesser);
    }

    public void getMediaHeight(List<Q16> listPeoples) {
        double sum = 0, media;
        int cont = 0;
        for(int x = 0; x < listPeoples.size(); x++) {
            if(listPeoples.get(x).getSex().equals("M")) {
                sum += listPeoples.get(x).getHeight();
                cont++;
            }
        }
        media = sum / cont;

        System.out.println("A média de altura é de: " + media);
    }

    public void getNumberWoman(List<Q16> listPeoples) {
        int cont = 0;
        for(int x = 0; x < listPeoples.size(); x++) {
            if(listPeoples.get(x).getSex().equals("F")) {
                cont++;
            }
        }

        System.out.println("O número de mulheres é de: " + cont);
    }

    public double getHeight() {
        return height;
    }

    public Character getSex() {
        return sex;
    }
}
