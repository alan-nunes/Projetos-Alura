import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    public double ApiConvertendoCambio(String origem, String destino, double valor) throws IOException, InterruptedException {
        String key = "1498912d731bd223d257ac9d";
        String url = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + origem + "/" + destino + "/" +valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = null;
        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(response.body()).getAsJsonObject();

        return jsonObject.get("conversion_result").getAsDouble();
    }
}


//    public Conversor buscaCambio(String cambio) throws IOException, InterruptedException {
//        // Construindo o URL para a requisição com base na moeda de interesse
//        String endereco = "https://v6.exchangerate-api.com/v6/1498912d731bd223d257ac9d/latest/" + cambio;
//
//        // Criando um cliente HTTP
//        HttpClient client = HttpClient.newHttpClient();
//
//        // Criando uma requisição HTTP GET para o URL especificado
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
//
//        // Enviando a requisição HTTP e obtendo a resposta como uma string
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
////        String json =  response.body();
////        System.out.println(json);
////        return new Gson().fromJson(response.body(), Conversor.class);
//
//        // Convertendo a string de resposta para um objeto JSON
//        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
//
//        // Obtendo o objeto JSON contendo as taxas de câmbio individuais
//        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
//
//        // Extraindo as taxas de câmbio individuais da resposta JSON
//        double ars = conversionRates.get("ARS").getAsDouble();
//        double bob = conversionRates.get("BOB").getAsDouble();
//        double brl = conversionRates.get("BRL").getAsDouble();
//        double clp = conversionRates.get("CLP").getAsDouble();
//        double cop = conversionRates.get("COP").getAsDouble();
//        double usd = conversionRates.get("USD").getAsDouble();
//
//        // Criando e retornando um objeto Conversor com as taxas de câmbio extraídas
//        return new Conversor(ars, bob, clp, brl, cop, usd);
//        //return new Gson().fromJson(response.body(), Conversor.class);
//    }
//
//    public double convertendoCambio(double valorOriginal, double cambio) throws IOException, InterruptedException {
//       return valorOriginal * cambio;
//    }