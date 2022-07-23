package br.com.dio.basecamp;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 7.5f;
        float f2 = 2.5f;
        double d1 = 40.7d;
        char c1 = 'x';
        char c2 = 'y';

        String s1 = "Juliet";
        String s2 = "Tamires";
        String s3 = "Juliana";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1595L;
        long l2 = 8995L;
        byte y1 = 1;
        short h1 = 26;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 > f2 " + (f1 > f2));
        System.out.println("f1 <= f2 " + (f1 <= f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2" + s1 == s2);
        System.out.println("s1 == s3" + s1 == s3);
        System.out.println("s1 != s2 " + s1 != s2);


        System.out.println(" b1 == b2" + (b1 == b2));
        System.out.println(" b1 != b2" + (b1 != b2));


        System.out.println("i2 > f1" + (i2 >f1));
        System.out.println("d1 == h1" + (d1 == h1));

        System.out.println("i2 == i2" + (l1 == i2));
        System.out.println("l2 >= i1" + (l2 >= i1));
        System.out.println("y1 != h1" + (y1 != h1));

        // System.out.println(s1 >= s2); // não faz sentido
        // System.out.println(s1 < s2);
        // System.out.println(b1 > b2); // não tem logica em comparar dados distintos
        // System.out.println( b1 <=i1);
        // System.out.println(s2 != c1); // string x char
        // System.out.println(s3 != i1);




    }

}
