package br.com.dio.basecamp;

public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // and - conjunção
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        // or - disjunção
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        // xor - disfunção exclusiva
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        // negação
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 20;
        int i2 = 25;
        float f1 = 30f;
        float f2 = 40f;

        // exemplo do prof
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 3569.63;
        double mediaSalario = 1867.25;

        int quantidadeDependentes = 3;
        int mediaDependentes = 1;

        System.out.println(salarioMensal < mediaSalario && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean receberAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println(" Receber Auxilio " + receberAuxilio);


    }


}
