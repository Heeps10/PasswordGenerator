package com.example.newproject4;

import javafx.scene.control.Alert;

import static java.lang.Integer.parseInt;

public class Generator extends Object {
    private String Password;
    private int Rand;
    private int Rand2;
    private int Rand3;
    private String Input;

    Generator() {
        this.Password = "";
        this.Rand = 0;
        this.Rand2 = 0;
        this.Rand3 = 0;
        this.Input = "";
    }

    Generator(String passInput) {
        this.Input = passInput;
        this.Password = "";
        this.Rand = 0;
        this.Rand2 = 0;
        this.Rand3 = 0;
    }

    public void Generate() {
        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String symbols = "!@#$%^&*";

        if (this.Input.length() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR,
                    "Unable To Generate Password No Input");
            alert.showAndWait();
            return;
        }

        try {
            int digit = parseInt(this.Input);

            for (int i = 0; i < digit; i++) {
                this.Rand = (int) (Math.random() * 4);
                this.Rand2 = (int) (Math.random() * 4);
                this.Rand3 = (int) (Math.random() * 12);

                if(this.Rand3 % 2 == 0) {
                    if (this.Rand == 0) {
                        this.Password += String.valueOf((int) (9 * Math.random()));
                    } else if (this.Rand == 1) {
                        this.Rand = (int) (Math.random() * 25);
                        this.Password += String.valueOf(lower_cases.charAt(this.Rand));
                    } else if (this.Rand == 2) {
                        this.Rand = (int) (Math.random() * 25);
                        this.Password += String.valueOf(upper_cases.charAt(this.Rand));
                    } else if (this.Rand == 3) {
                        this.Rand = (int) (Math.random() * symbols.length());
                        this.Password += String.valueOf(symbols.charAt(this.Rand));
                    }
                }

                if(this.Rand3 != 0){
                    if (this.Rand2 == 0) {
                        this.Password += String.valueOf((int) (9 * Math.random()));
                    } else if (this.Rand2 == 1) {
                        this.Rand2 = (int) (Math.random() * 25);
                        this.Password += String.valueOf(lower_cases.charAt(this.Rand2));
                    } else if (this.Rand2 == 2) {
                        this.Rand2 = (int) (Math.random() * 25);
                        this.Password += String.valueOf(upper_cases.charAt(this.Rand2));
                    } else if (this.Rand2 == 3) {
                        this.Rand2 = (int) (Math.random() * symbols.length());
                        this.Password += String.valueOf(symbols.charAt(this.Rand2));
                    }
                }
            }
        } catch (NumberFormatException NFE) {
            Alert alert = new Alert(Alert.AlertType.ERROR,
                    "Enter an Integer");
            alert.showAndWait();

            System.out.println("Please Enter an Integer");
            return;
        }
    }

    public String getPassword() {
        return this.Password;
    }
}
