package com.company;

import java.io.DataInputStream;
import java.io.IOException;

public class Main {

    static void swap(char[] a,int i,char[] b,int j){
        a[i] = b[j];
    }

    public static void main(String[] args) {
        DataInputStream bf = new DataInputStream(System.in);

        scribbler o = new scribbler();

        try {
            System.out.println("unscramble this " + o.shuffle());

            String read = bf.readLine();

            if (o.check(read)){
                System.out.println("yup u win");
            }
            else o.rectErr();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String a = "Windows";

        char[] con = a.toCharArray();

        System.out.println(con);

        char[] sto = new char[100];

        sto = con;

        for (int i = 0; i < con.length; i++) {
           int r = (int) (Math.random() * 10) % con.length;
            System.out.println(r + " " + con[r] );
            sto[r] = con[i];
        }

        System.out.println(sto);
    }
}
