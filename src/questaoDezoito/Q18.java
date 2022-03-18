package questaoDezoito;

import utils.UtilsTools;

import java.time.LocalDate;
import java.util.Date;

/*
    18.	Crie uma classe para representar uma pessoa, com os atributos
        privados de nome, data de nascimento e altura. Crie os métodos
        públicos necessários para sets e gets e também um método para
        imprimir todos dados de uma pessoa. Crie um método para calcular
        a idade da pessoa.
 */
public class Q18 extends UtilsTools {

    private String name;
    private LocalDate birthday;
    private double height;

    public void calculateAge(LocalDate birthday) {
        int age = LocalDate.now().getYear() - birthday.getYear();
        System.out.println("Sua idade é: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Q18{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", height=" + height +
                '}';
    }
}
