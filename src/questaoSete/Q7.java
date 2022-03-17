package questaoSete;

import utils.UtilsTools;

/*
    7.	Faça um programa em java que calcule e mostre a área
        de um losango. Sabe-se que: A = (diagonal_maior * diagonal_menor)/2
 */
public class Q7 {

    private UtilsTools ut;
    private double majorDiagonal, minorDiagonal, area;

    public Q7() {
        this.ut = new UtilsTools();
    }

    public void getDiagonal() {
        System.out.println("Por favor, informe a diagonal maior:");
        this.majorDiagonal = this.ut.getGetS().nextDouble();

        System.out.println("Por favor, informe a diagonal menor:");
        this.minorDiagonal = this.ut.getGetS().nextDouble();

        calculateAreaRhombus(this.majorDiagonal, this.minorDiagonal);
    }

    private void calculateAreaRhombus(double majorDiagonal, double minorDiagonal) {
        this.area = (majorDiagonal * minorDiagonal) / 2;

        System.out.println("Área do losango: " + this.area);
    }

}
