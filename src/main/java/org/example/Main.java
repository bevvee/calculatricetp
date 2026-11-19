package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculatrice calc = new Calculatrice();

        int resultat = calc.addition(5, 3);
        System.out.println("Résultat de l'addition : " + resultat);

        System.out.println("Multiplication 3 * 4 = " + Calculatrice.multiplication(3, 4));

    }
}