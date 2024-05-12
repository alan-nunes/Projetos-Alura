//public record Conversor(double ARS, double BOB, double BRL, double CLP,
//                            double COP, double USD) {
//
//    public double getBOB(){
//        return BOB;
//    }
//    public double getARS(){
//        return ARS;
//    }
//
//    public double getBRL(){
//        return BRL;
//    }
//    public double getCLP(){
//        return CLP;
//    }
//    public double getCOP(){
//        return COP;
//    }
//    public double getUSD(){
//        return USD;
//    }
//}
//

import java.util.Map;

public record Conversor(Map<String, Double> taxasDeCambio) {
    public Conversor(double ars, double bob, double brl, double clp, double cop, double usd) {
        this(Map.of("ARS", ars, "BOB", bob, "BRL", brl, "CLP", clp, "COP", cop, "USD", usd));
    }

    // Método de acesso para obter a taxa de câmbio de uma moeda específica
    public double getTaxa(String moeda) {
        return taxasDeCambio.getOrDefault(moeda, 0.0);
    }
}
