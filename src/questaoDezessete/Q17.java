package questaoDezessete;

import utils.UtilsTools;

import java.util.ArrayList;
import java.util.List;

/*
    17.	Criar um programa que calcule a média de salários de uma empresa,
        pedindo ao usuário a grade de funcionários e os salários, e devolvendo
        a média salarial.
 */
public class Q17 extends UtilsTools {

    private String employeeName;
    private double salary;

    public void getGradeEmployee() {
        Q17 q;
        List<Q17> listQ17 = new ArrayList<>();
        int cont = 0;

        do {
            q = new Q17();

            System.out.println("Informe o nome do funcionário:");
            setEmployeeName(getGetS().nextLine());

            System.out.println("Informe o salário do funcionário:");
            setSalary(getGetS().nextDouble());

            listQ17.add(q);

            cont++;
        } while (cont == 10);

        getMediaSalary(listQ17);
    }

    public void getMediaSalary(List<Q17> listEmployees) {
        double sum = 0, media;
        for (int x = 0; x < listEmployees.size(); x++) {
            sum += listEmployees.get(x).getSalary();
        }
        media = sum / listEmployees.size();

        System.out.println("A média salarial é de: " + media);
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
