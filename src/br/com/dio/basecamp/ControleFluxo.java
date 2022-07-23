package br.com.dio.basecamp;

/*
Criar Variáveis e expressões para usar nas estruturas if e switch.

Com if, exibir o nome do mês de acordo com o número. Evitar efeito flexa.
Faça outro if que verifique se o mês é Julho, Dezembro ou Janeiro, para assim exibir o texto "Férias".

Com switch(case) use string para a partir do dia de semana exibir seu número.

Fazer outro exemplo onde, se uma variável for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5
exibir "Talvez". Para demais valores exibir "Valor indefinido".

 */

import javax.sound.midi.Soundbank;

public class ControleFluxo {

    public static void main(String[] args) {

        ifFlexa(); // exemplo do que não fazer
        ifMes();
        ifFerias(); // não é uma boa pratica, melhor fazer switch

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlexa() {

        int mes = 1;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Gentileza informar o mês correto.");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifMes() {

        int mes = 3;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Gentileza informar o mês correto.");
        }
    }

    private static void ifFerias() {

        String mes = "Julho";
        if (mes == "Janeiro"){
            System.out.println("Férias");
        } else if (mes == "Julho"){
            System.out.println("Férias");
        } else if (mes == "Dezembro"){
            System.out.println("Férias");
        } else {
            System.out.println("Fora do período de férias.");
        }
    }

    private static void switchSemana(){

        String dia = "Segunda";
        switch (dia){
            case "Segunda":
            System.out.println(2);
            break;
            case "Terça":
            System.out.println(3);
            break;
            case "Quarta":
            System.out.println();
            break;
            case "Quinta":
            System.out.println();
            break;
            case "Sexta":
            System.out.println();
            break;
            case "Sábado":
            System.out.println();
            break;
            case "Domingo":
            System.out.println();
            break;
            default:
                System.out.println("Informe o dia correto!");

        }
    }

    private static void switchNumero() {

        int numero = 8;

        switch (numero){

            case 1 :
            case 2 :
            case 3 :
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido.");
                break;
        }
    }

    private static void switchFerias(){
        String mes = "dezembro";
        switch (mes){
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Fora do período de férias.");
                break;

        }

    }


}

