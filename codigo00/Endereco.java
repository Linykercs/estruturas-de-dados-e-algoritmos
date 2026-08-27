// Declaração da classe Endereco com atributos privados: rua, numero e bairro.
// Em Java, é uma boa prática encapsular os dados, mantendo os atributos
// privados e fornecendo métodos públicos para acessá-los (mesmo princípio
// de encapsulamento usado pelo professor na classe Pessoa).
public class Endereco{
    private String rua;
    private int numero;
    private String bairro;

    // Construtor padrão que chama outro construtor usando this, passando
    // valores padrão (null para rua e bairro, 0 para numero).
    public Endereco(){
        this(null, 0, null);
    }

    // Construtor que aceita parâmetros para inicializar os atributos rua,
    // numero e bairro.
    public Endereco(String rua, int numero, String bairro){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    // Métodos setRua e getRua que permitem definir e acessar o valor do
    // atributo rua. O this é utilizado para referenciar o atributo da
    // instância atual.
    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return this.rua;
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
        this.bairro = bairro;;
    }

    public String getBairro(){
        return this.bairro;
    }

    // O método toString é sobrescrito para fornecer uma representação em
    // string da instância Endereco. Aqui, o String.format é utilizado para
    // formatar a string de saída, mostrando os valores de rua, numero e
    // bairro.
    @Override
    public String toString(){
        return String.format("Endereco[Rua: %s, Número: %d, Bairro: %s]", getRua(), getNumero(), getBairro());
    }
}
