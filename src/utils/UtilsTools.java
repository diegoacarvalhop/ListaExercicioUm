package utils;

import javax.swing.*;
import java.util.Scanner;

public class UtilsTools {

    private Scanner getS;

    public UtilsTools() {
        this.getS = new Scanner(System.in);
    }

    public Scanner getGetS() {
        return getS;
    }

}