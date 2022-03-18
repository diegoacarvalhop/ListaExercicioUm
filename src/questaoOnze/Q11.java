package questaoOnze;

import utils.UtilsTools;

/*
    11.	Considere uma disciplina que adota o seguinte critério de aprovação:
        os alunos fazem duas provas (P1 e P2) iniciais; se a média nessas
        duas provas for maior ou igual a 5.0, e se nenhuma das duas notas
        for inferior a 3.0, o aluno passa direto. Caso contrário, o aluno
        faz uma terceira prova (P3) e a média é calculada considerando-se essa
        terceira nota e a maior das notas entre P1 e P2. Neste caso, o aluno
        é aprovado se a média final for maior ou igual a 5.0. Escreva um programa
        em Java que leia inicialmente as duas notas de um aluno, fornecidas pelo
        usuário via teclado. Se as notas não forem suficientes para o aluno passar
        direto, o programa deve ler a nota da terceira prova, também fornecida via o
        teclado. Como saída, o programa deve imprimir a média final do aluno, seguida
        da mensagem "Aprovado" ou "Reprovado", conforme o critério descrito acima.
 */
public class Q11 {

    private UtilsTools ut;
    private double p1, p2, p3, average;

    public Q11() {
        this.ut = new UtilsTools();
    }

    public void getNotes() {
        System.out.println("Por favor, informe a primeira nota:");
        this.p1 = ut.getGetS().nextInt();

        System.out.println("Por favor, informe a segunda nota:");
        this.p2 = ut.getGetS().nextInt();

        this.average = calculateAverage(p1, p2);

        if (this.average >= 5.0) {
            System.out.println("Média " + this.average + ": Aprovado");
        } else {
            System.out.println("Não foi suficiente para ser aprovado. Por favor, informe a terceira nota:");
            this.p3 = ut.getGetS().nextInt();
            if (this.p1 > this.p2) {
                this.average = calculateAverage(this.p1, this.p3);
            } else if (this.p2 > this.p1) {
                this.average = calculateAverage(this.p2, this.p3);
            } else {
                this.average = calculateAverage(this.p1, this.p3);
            }
            if (this.average >= 5.0) {
                System.out.println("Média " + this.average + ": Aprovado");
            } else {
                System.out.println("Média " + this.average + ": Reprovado");
            }
        }
    }

    private double calculateAverage(double p1, double p2) {
        return (p1 + p2) / 2;
    }

}
