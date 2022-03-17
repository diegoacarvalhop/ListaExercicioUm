package questaoNove;

import utils.UtilsTools;

/*
    9.	Implemente um programa em Java que leia as medidas dos lados de um
        triângulo e escreva se ele é equilátero, isósceles ou escaleno. Sendo que:
        ○	Triângulo Equilátero: possui os 3 lados iguais.
        ○	Triângulo Isósceles: possui 2 lados iguais.
        ○	Triângulo Escaleno: possui 3 lados diferentes.

 */
public class Q9 {

    private UtilsTools ut;
    private int sideA, sideB, sideC;

    public Q9() {
        this.ut = new UtilsTools();
    }

    public void getTriangle() {
        System.out.println("Por favor, informe o lado A do triângulo:");
        this.sideA = this.ut.getGetS().nextInt();

        System.out.println("Por favor, informe o lado B do triângulo:");
        this.sideB = this.ut.getGetS().nextInt();

        System.out.println("Por favor, informe o lado C do triângulo:");
        this.sideC = this.ut.getGetS().nextInt();

        returnTriangleType(this.sideA, this.sideB, this.sideC);
    }

    private void returnTriangleType(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideA == sideC) {
            System.out.println("Triângulo Equilátero");
        } else if ((sideA == sideB && sideA != sideC) ||
                (sideA == sideC && sideA != sideB) ||
                (sideB == sideC && sideB != sideA)) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }

}
