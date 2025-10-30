import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultarCEP {
    public static void Consultar(String cep) throws IOException {
        String endpoint = "https://viacep.com.br/ws/"+ cep +"/json/";
        URL url = new URL(endpoint);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine = "";
        String response = "";
        while ((inputLine = in.readLine()) != null) {
            response += inputLine;
        }
        in.close();

        JsonObject obj = JsonParser.parseString(response).getAsJsonObject();
        if(obj.has("Erro")){
            System.out.println("CEP não Localizado");
            return;
        }
        Gson gson = new Gson();
        Endereco endereco = gson.fromJson(response, Endereco.class);
        endereco.Exibir();


    }
}
