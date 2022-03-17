package questaoCinco;

import utils.UtilsTools;

/*
    5.	Faça um programa em java que receba o valor dos catetos
        a e b de um triângulo, calcule e mostre o valor da hipotenusa.
        Fórmula (h = )
 */
public class Q5 {

    private UtilsTools ut;
    private double sideA, sideB, hypotenuse;

    public Q5() {
        this.ut = new UtilsTools();
    }

    public void getSides() {
        System.out.println("Por favor, informe o cateto A do triângulo:");
        this.sideA = this.ut.getGetS().nextDouble();

        System.out.println("Por favor, informe o cateto B do triângulo:");
        this.sideB = this.ut.getGetS().nextDouble();

        calculateHypotenuse(sideA, sideB);
    }

    private void calculateHypotenuse(double sideA, double sideB) {
        this.hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        System.out.println("Hipotenusa:" + this.hypotenuse);
    }

}
