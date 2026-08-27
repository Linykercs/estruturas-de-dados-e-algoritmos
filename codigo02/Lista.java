// A classe Lista é uma implementação genérica de uma lista encadeada, onde
// T representa o tipo de dados que a lista armazenará. Os atributos
// primeiroNo e ultimoNo são referências ao primeiro e ao último nó da
// lista, respectivamente, enquanto nomeLista armazena o nome descritivo da
// lista.
public class Lista<T> {
	private String nomeLista;
	private No<T> primeiroNo;
	private No<T> ultimoNo;

    // Construtor vazio que inicializa a lista, delegando com this para o
    // construtor completo (aqui sem um nome padrão fixo, diferente para
    // cada lista que não recebe nome).
    public Lista(){
        this(null);
    }

    // Esse construtor permite criar uma lista com um nome específico,
    // definido pelo usuário. Inicialmente, a lista está vazia, então
    // primeiroNo e ultimoNo são definidos como null.
    public Lista(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;

    }

    // O método addInicio insere um novo nó no início da lista. Se a lista
    // estiver vazia (primeiroNo é null), o novo nó se torna tanto o
    // primeiro quanto o último nó da lista. Caso contrário, o novo nó é
    // vinculado ao nó que era o primeiro, e então se torna o novo
    // primeiroNo.
    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);

        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;

        }else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }

    }
    // O método removeInicio remove o primeiro nó da lista. Se a lista
    // estiver vazia, ele exibe uma mensagem indicando que a lista está
    // vazia. Caso contrário, o nó atual primeiroNo é removido, e o próximo
    // nó na sequência se torna o novo primeiroNo (tratando também o caso
    // especial em que só havia um nó, onde primeiroNo e ultimoNo eram o
    // mesmo).
    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("LISTA VAZIA!");
        } else{
            System.out.println("Dado: " + primeiroNo.getDado() + " removido!");

            if (primeiroNo == ultimoNo) {
                primeiroNo = primeiroNo.getNextNo();
                ultimoNo = ultimoNo.getNextNo();
            }else{
                primeiroNo = primeiroNo.getNextNo();
            }
        }
    }

    // O método imprimeLista percorre a lista e imprime todos os dados
    // armazenados. Se a lista estiver vazia, uma mensagem indicando isso é
    // exibida. Caso contrário, ele percorre cada nó da lista, imprimindo o
    // dado armazenado em cada um.
    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia");
        }else{
            System.out.println("Dados da lista: " + getNomeLista());
            No<T> aux = primeiroNo;
        while(aux != null){
            System.out.println(aux.toString());
            aux = aux.getNextNo();
            }
        }
    }



    // Métodos setNomeLista e getNomeLista que permitem definir e acessar o
    // valor do atributo nomeLista. O this é utilizado para referenciar o
    // atributo da instância atual.
    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public String getNomeLista() {
        return this.nomeLista;
    }

    // Métodos de acesso (getters e setters) para o atributo primeiroNo.
    // Eles não fazem parte da lógica de inserção/remoção da lista, mas
    // permitem consultar ou substituir diretamente a referência ao
    // primeiro nó, útil por exemplo em testes e depuração.
    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No<T> getPrimeiroNo() {
        return this.primeiroNo;
    }

    // Métodos de acesso (getters e setters) para o atributo ultimoNo,
    // seguindo o mesmo princípio do primeiroNo.
    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public No<T> getUltimoNo() {
        return this.ultimoNo;
    }


	}
