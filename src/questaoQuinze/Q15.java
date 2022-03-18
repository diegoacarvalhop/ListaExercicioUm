package questaoQuinze;

import utils.UtilsTools;

/*
    15.	Escreva um programa que, com base em uma temperatura em graus celsius,
        a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
        seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
 */
public class Q15 extends UtilsTools {

    private static final double KELVIN = 273.15;
    private static final double REAUMUR = 0.8;
    private static final double RANKINE = 1.8 + 32 + 459.67;
    private static final double FAHRENHEIT = 1.8 + 32;

    private double temperatureCelsius;

    public void getTemperatureCelsius() {
        System.out.println("Informe a temperatura em Graus Celsius (C):");
        this.temperatureCelsius = getGetS().nextDouble();

        calculateTemperature(this.temperatureCelsius);
    }

    private void calculateTemperature(double temperatureCelsius) {
        System.out.println("Celcius (C): " + temperatureCelsius);
        System.out.println("Kelvin (K): " + (temperatureCelsius + Q15.KELVIN));
        System.out.println("Réaumur (Re): " + temperatureCelsius * Q15.REAUMUR);
        System.out.println("Rankine (Ra): " + temperatureCelsius * Q15.RANKINE);
        System.out.println("Fahrenheit (F): " + temperatureCelsius * Q15.FAHRENHEIT);
    }
    
}
