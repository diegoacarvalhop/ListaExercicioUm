package questaoQuatro;

import utils.UtilsTools;

/*
* 4.	Escreva um programa em java para ler o nome e a idade de uma pessoa,
*       e exibir quantos dias de vida ela possui. Considere sempre anos completos,
*       e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida;
*       veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS
*/
public class Q4 {

    private UtilsTools ut;
    private int age, days;
    private String name;
    private final int AGEDAYS = 365;

    public Q4() {
        this.ut = new UtilsTools();
    }

    public void getNameAge() {
        System.out.println("Por favor, informe se nome:");
        this.name = this.ut.getGetS().nextLine();

        System.out.println("Por favor, informe sua idade:");
        this.age = this.ut.getGetS().nextInt();

        this.days = calculateDays(this.age);

        System.out.println(this.name + ", VOCÊ JÁ VIVEU " + this.days + " DIAS");
    }

    private int calculateDays(int age) {
        return age * this.AGEDAYS;
    }

}
