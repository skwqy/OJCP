package com.skwqy.ocjp.z808.p050;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-26 10:35
 */
public class Test050 {
    public static String doMsg(char x){
        return "Good Day!";
    }

    public static String doMsg(int y){
        return "Good Luck!";
    }

    public static void main(String[] args) {
        char x=8;
        int z='8';
        System.out.println(doMsg(x));
        System.out.println(doMsg(z));
    }
}
