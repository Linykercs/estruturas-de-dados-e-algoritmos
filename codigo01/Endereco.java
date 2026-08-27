// Declaração da classe Endereco com atributos privados: nomeRua, numero e
// bairro. Em Java, é uma boa prática encapsular os dados, mantendo os
// atributos privados e fornecendo métodos públicos para acessá-los.
public class Endereco {
    private String nomeRua;
    private int numero;
    private String bairro;

    // Construtor padrão que chama outro construtor usando this, passando
    // valores padrão (null e 0).
    public Endereco(){
        this(null, 0, null);
    }

    // Construtor que aceita parâmetros para inicializar os atributos
    // nomeRua, numero e bairro.
    public Endereco(String nomeRua, int numero, String bairro){
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.bairro = bairro;
    }

    // Métodos setNomeRua e getNomeRua para definir e acessar o valor do
    // atributo nomeRua. O this é utilizado para referenciar o atributo da
    // instância atual.
    public void setNomeRua(String nomeRua){
        this.nomeRua = nomeRua;
    }

    public String getNomeRua(){
        return this.nomeRua;
    }

    // Métodos setNumero e getNumero para definir e acessar o valor do
    // atributo numero.
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    // Métodos setBairro e getBairro para definir e acessar o valor do
    // atributo bairro.
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getBairro(){
        return this.bairro;
    }

    // O método toString é sobrescrito para fornecer uma representação em
    // string da instância Endereco, usando String.format para montar a
    // saída com nomeRua, numero e bairro.
    @Override
    public String toString(){
        return String.format("Endereco[Rua: %s, Numero: %d, Bairo: %s]",getNomeRua(), getNumero(), getBairro());
    }
}
