public class Endereco {
    private String logradouro;
    private String bairro;
    private int numero;
    private String cep;
    private String localidade;

    public Endereco(String logradouro, String bairro, int numero, String cep, String localidade) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.localidade = localidade;
    }

    public void Exibir(){
        System.out.println("Rua: " + logradouro);
        System.out.println("Bairro: " + bairro);
        System.out.println("Número: " + numero);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + localidade);
    }
}
