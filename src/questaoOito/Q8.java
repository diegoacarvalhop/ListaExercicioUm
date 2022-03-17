package questaoOito;

import utils.UtilsTools;

/*
    8.	Implemente um programa em Java que leia as coordenadas de dois
        pontos e calcule a distância entre eles. Lembre-se que a distância
        entre dois pontos é dada pela seguinte equação:  . Utilize as funções
        sqrt e pow da classe Math para calcular a raiz quadrada e elevar os
        números as suas devidas potências.
 */
public class Q8 {

    private UtilsTools ut;
    private double x1, x2, y1, y2, distance;

    public Q8() {
        this.ut = new UtilsTools();
    }

    public void getCoordinates() {
        System.out.println("Informe o x do primeiro ponto: ");
        this.x1 = this.ut.getGetS().nextDouble();
        System.out.println("Informe o y do primeiro ponto: ");
        this.y1 = this.ut.getGetS().nextDouble();

        System.out.println("Informe o x do segundo ponto: ");
        this.x2 = this.ut.getGetS().nextDouble();
        System.out.println("Informe o y do segundo ponto: ");
        this.y2 = this.ut.getGetS().nextDouble();

        calculateDistance(x1, x2, y1, y2);
    }

    private void calculateDistance(double x1, double x2, double y1, double y2) {
        this.distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("A distância entre os pontos " + Math.pow((x2 - x1), 2) + " e " + Math.pow((y2 - y1), 2) + " é: " + this.distance);
    }

}
