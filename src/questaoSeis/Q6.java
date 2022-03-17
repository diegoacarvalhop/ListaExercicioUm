package questaoSeis;

import utils.UtilsTools;

/*
    6.	Faça um programa em java que receba o valor do salário mínimo
        e o valor do salário de um funcionário, calcule e mostre a quantidade
        de salários mínimos que ganha esse funcionário.
 */
public class Q6 {

    private UtilsTools ut;
    private double minimumSalary, salary, qttMinumumSalary;

    public Q6() {
        this.ut = new UtilsTools();
    }

    public void getMinimumSalaryAndSalary() {
        System.out.println("Por favor, informe o valor do salário mínimo:");
        this.minimumSalary = this.ut.getGetS().nextDouble();

        System.out.println("Por favor, informe o valor do salário do funcionário:");
        this.salary = this.ut.getGetS().nextDouble();

        calculateQttMinumumSalary(this.minimumSalary, this.salary);

    }

    private void calculateQttMinumumSalary(double minimumSalary, double salary) {
        this.qttMinumumSalary = salary / minimumSalary;

        System.out.println("O funcionário recebe " + this.qttMinumumSalary + " salários mínimos.");
    }

}
