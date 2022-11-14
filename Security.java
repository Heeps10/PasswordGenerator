package com.example.newproject4;

public class Security extends Object{
    private int key = 5;
    private String P;
    private String characters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM!@#$%^&*";

    Security(){
        this.P = "";
    }

    public Security(String Pass){
        this.P = Pass;
    }

    public String Encryption(){
        char[] chars = this.P.toCharArray();
        String newP = "";

        for(char i: chars){
            i -= this.key;
            newP += i;
        }

        return newP;
    }
}
