// Declaração da classe Pessoa com atributos privados: nome, idade e end
// (um Endereco). Em Java, é uma boa prática encapsular os dados, mantendo
// os atributos privados e fornecendo métodos públicos para acessá-los.
public class Pessoa{

    private String nome;
    private int idade;
    private Endereco end;

    // Construtor padrão que chama outro construtor usando this, passando
    // valores padrão (null para nome, 0 para idade e um novo Endereco
    // vazio, em vez de "" e 0 como no exemplo mais simples do professor).
    public Pessoa(){
        this(null, 0, new Endereco());
    }

    // Construtor que aceita nome e idade, reaproveitando o construtor
    // completo com um Endereco vazio como padrão.
    public Pessoa(String nome, int idade){
        this(nome, idade, new Endereco());
    }

    // Construtor que aceita parâmetros para inicializar os atributos nome,
    // idade e end. Ele chama os métodos setNome, setIdade e setEnd para
    // atribuir os valores aos atributos.
    public Pessoa(String nome, int idade, Endereco end){
        setNome(nome);
        setIdade(idade);
        setEnd(end);
    }

    // Métodos setNome e getNome que permitem definir e acessar o valor do
    // atributo nome. O this é utilizado para referenciar o atributo da
    // instância atual.
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    // Métodos setIdade e getIdade para definir e acessar o valor do
    // atributo idade.
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    // Métodos setEnd e getEnd para definir e acessar o valor do atributo
    // end (o Endereco associado a esta Pessoa).
    public void setEnd(Endereco end){
        this.end = end;
    }

    public Endereco getEnd(){
        return this.end;
    }

    // O método toString é sobrescrito para fornecer uma representação em
    // string da instância Pessoa. Aqui, o String.format é utilizado para
    // formatar a string de saída, mostrando os valores de nome, idade e o
    // toString do Endereco associado.
    @Override
    public String toString(){
        return String.format("Pessoa[Nome: %s, Idade: %d, %s]", getNome(), getIdade(), end.toString());
    }
}
