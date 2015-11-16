package com.company;

/**
 * Created by madhu on 7/23/2015.
 */

interface shuffle{
    String shuffle();

    boolean check(String s);
}

class str{

    String[] array = {"apple" , "windows" , "apple" ,"javascript" ,"shuffle", "verbose" ,"rocket"};

    String getStr()
    {
        int r = (int) ((Math.random() * 10) % 7);
        System.out.println("\n\tR=\t"+r +"\n String="+array[r]);

        return array[r];
    }
}

public class scribbler extends str implements shuffle {


    private String original;
    private String duplicate;

    public String shuffle(){


        this.original = getStr();

        this.duplicate = original;

        System.out.println("\n\t Original String="+original);
        System.out.println("\n\t duplicate String="+duplicate);

        int len  = original.length();

        System.out.println("\n\t len String="+len);

        String  retStr ;

        retStr=duplicate;

        for  (int i = 0; i < len; i++) {
            int r = (int) ((Math.random() * 10) % len);
            retStr.replace(retStr.charAt(i),retStr.charAt(r));
        }

        return retStr;
    }

     public boolean check(String s){
        if (s == this.original) return true;

        else return false;
    }

    void rectErr(){
        System.out.println("hmm.. it was " + this.original);
    }
}
