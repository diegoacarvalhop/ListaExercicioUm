package questaoDois;

import utils.UtilsTools;

public class Q2 {
    private UtilsTools ut;
    private double side, height, area;

    public Q2() {
        this.ut = new UtilsTools();
    }

    public void getGround() {
        boolean go = true;

        do {
            System.out.println("Por favor informe o lado do terreno:");
            this.side = this.ut.getGetS().nextDouble();

            System.out.println("Por favor informe a altura do terreno:");
            this.height = this.ut.getGetS().nextDouble();

            if (this.side == this.height) {
                System.out.println("O lado e a altura do terreno não podem ser iguais! Por favor informe novos valores.");
                go = true;
            } else {
                go = false;
            }
        } while (go);

        calculateArea(this.side, this.height);
    }

    private void calculateArea(double side, double height) {
        this.area = side * height;

        System.out.println("A área do terreno é " +  this.area);
    }

}
