package questaoDoze;

import utils.UtilsTools;

public class Q12 {

    private static final double MERCURY = 0.37;
    private static final double VENUS = 0.88;
    private static final double MARS = 0.38;
    private static final double JUPITER = 2.64;
    private static final double SATURN = 1.15;
    private static final double URANUS = 1.17;

    private UtilsTools ut;
    private double weight, weightPlanet;
    private int planet;

    public Q12() {
        this.ut = new UtilsTools();
    }

    public void getWeight() {
        System.out.println("Por favor, informe o seu peso:");
        this.weight = ut.getGetS().nextDouble();

        System.out.println("Agora informe qual planeta você deseja calcular seu peso." +
                "\n1 - Mercúrio" +
                "\n2 - Vênus" +
                "\n3 - Marte" +
                "\n4 - Júpiter" +
                "\n5 - Saturno" +
                "\n6 - Urano" +
                "\nOpção:");
        this.planet = ut.getGetS().nextInt();

        calculateWeightPlanet(this.weight, this.planet);
    }

    private void calculateWeightPlanet(double weight, int planet) {
        switch (planet) {
            case 1:
                this.weightPlanet = (weight / 10) * Q12.MERCURY;
                break;
            case 2:
                this.weightPlanet = (weight / 10) * Q12.VENUS;
                break;
            case 3:
                this.weightPlanet = (weight / 10) * Q12.MARS;
                break;
            case 4:
                this.weightPlanet = (weight / 10) * Q12.JUPITER;
                break;
            case 5:
                this.weightPlanet = (weight / 10) * Q12.SATURN;
                break;
            case 6:
                this.weightPlanet = (weight / 10) * Q12.URANUS;
                break;
        }
        System.out.println("O seu peso no planeta escolhido é: " + this.weightPlanet);
    }

}
