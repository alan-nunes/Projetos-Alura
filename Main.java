import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String menu = """
                     *********************************************************
                                    Conversor de Moedas
                     *********************************************************
                                    Selecione uma opção:
                    
                                    1 - Dolar Americano USD para >>> Real BRL
                                    2 - Real BRL para >>> Dolar Americano USD
                                    3 - Dolar Americano USD para  >>> Peso Argentino ARS
                                    4 - Peso Argentino ARS para >>> Dolar Americano USD
                                    5 - Real BRL para >>> Peso Argentino USR
                                    6 - Peso Argentino para >>> Real BRL
                                    7 - Sair
                    
                     ***********************************************************
                """;
        Consulta consulta = new Consulta();
        Conversor conversor;

        while (opcao != 7) {
            try{
                System.out.println(menu);
                opcao = sc.nextInt();
                double valor;

                if(opcao == 1){
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble();

                    System.out.println(consulta.ApiConvertendoCambio("USD", "BRL", valor));
                }

                else if(opcao == 2){
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble();
                    System.out.println(consulta.ApiConvertendoCambio("BRL", "USD", valor));
                }

                else if(opcao == 3){
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble();
                    System.out.println(consulta.ApiConvertendoCambio("USD", "ARS", valor));
                }

                else if(opcao == 4){
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble();
                    System.out.println(consulta.ApiConvertendoCambio("ARS", "USD", valor));
                }

                else if(opcao == 5){
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble();
                    System.out.println(consulta.ApiConvertendoCambio("BRL", "USR", valor));
                }

                else if(opcao == 6){
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble();
                    System.out.println(consulta.ApiConvertendoCambio("USR", "BRL", valor));
                }

                else if(opcao != 7){
                    System.out.println("Opção inválida");
                }

                else{
                    System.out.println("Finalizando aplicação");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}

//// double valorConvertido = 0;
//boolean continuar = true;
//int opcao;
//
//        while (continuar) {
//        System.out.println("Digite o valor que deseja converter: ");
//double valor = sc.nextDouble();
//
//            System.out.println("Informe a sigla do câmbio do valor digitado: ");
//            System.out.println("ARS - BOB - BRL - CLP - COP - USD");
//String siglaOrigem = sc.next().toUpperCase();
//
//            if (siglaOrigem.equals("S")) {
//continuar = false;
//        break;
//        }
//
//conversor = consulta.buscaCambio(siglaOrigem);
//
//            if (conversor != null) {
//        System.out.println("Agora informe para qual cambio deseja converter ou digite S para sair: ");
//                System.out.println("S - ARS - BOB - BRL - CLP- COP - USD");
//String siglaDestino = sc.next().toUpperCase();
//
//                if (siglaDestino.equals("S")) {
//continuar = false;
//        break;
//        }
//
//conversor = consulta.buscaCambio(siglaDestino);
//
//                if (conversor != null) {
//double taxa = conversor.getTaxa(siglaOrigem);
//double valorConvertido = consulta.convertendoCambio(valor, taxa);
//                    System.out.println("Valor convertido: " + valorConvertido + " " + siglaDestino);
//                } else {
//                        System.out.println("Sigla de destino inválida.");
//                }
//                        } else {
//                        System.out.println("Sigla de origem inválida.");
//            }
//                    }
//// System.out.println(conversor.USD());