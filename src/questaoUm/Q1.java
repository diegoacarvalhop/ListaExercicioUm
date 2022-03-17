package questaoUm;

import utils.UtilsTools;

public class Q1 {

    private UtilsTools ut;
    private String phraseUser, phraseFinal, wordPhrase, wordReplace;

    public Q1() {
        this.ut = new UtilsTools();
    }

    public void getPhrase() {
        System.out.println("Por favor, escreva uma frase:");
        this.phraseUser = this.ut.getGetS().nextLine();

        replacePhrase(this.phraseUser);
    }

    private void replacePhrase(String phraseUser) {
        System.out.println("Por favor, informe qual palavra da frase anterior deseja substituir:");
        this.wordPhrase = this.ut.getGetS().nextLine();

        System.out.println("Substituir por:");
        this.wordReplace = this.ut.getGetS().nextLine();

        this.phraseFinal = phraseUser.replace(this.wordPhrase, this.wordReplace);

        System.out.println(this.phraseFinal);
    }

}
