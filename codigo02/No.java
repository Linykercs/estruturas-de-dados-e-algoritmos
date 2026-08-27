// Essa classe define um nó genérico No<T> para uma estrutura de dados. O T
// é um parâmetro de tipo genérico que permite que a classe funcione com
// qualquer tipo de dado. O atributo dado armazena o valor do nó, e nextNo
// é uma referência ao próximo nó na lista.
public class No<T>{
    private T dado;
    private No<T> nextNo;

    // Construtor padrão que cria um nó sem dado (dado = null), chamando o
    // outro construtor com this.
    public No(){
        this(null);
    }

    // Esse construtor cria um novo nó inicializando o dado com o valor
    // fornecido e define nextNo como null, indicando que o nó não está
    // vinculado a outro nó.
    public No(T dado){
        this.dado = dado;
        this.nextNo = null;
    }

    // Esses são os métodos de acesso (getters e setters) para o atributo
    // dado. Eles permitem ler e modificar o valor armazenado no nó.
    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    // Esses métodos são usados para definir e acessar o próximo nó na
    // lista. setNextNo permite vincular o nó atual a outro nó, e getNextNo
    // retorna a referência ao próximo nó.
    public void setNextNo(No<T> nextNo){
        this.nextNo = nextNo;
    }

    public No<T> getNextNo(){
        return this.nextNo;
    }

    // O método toString foi sobrescrito para fornecer uma representação em
    // string do objeto No. Ele retorna uma string que exibe o valor
    // armazenado em dado.
    @Override
    public String toString(){
        return "Dado{ " + getDado() + "}";
    }
}
