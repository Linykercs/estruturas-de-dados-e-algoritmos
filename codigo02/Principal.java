// A classe Principal contém o método main, que é o ponto de entrada do
// programa.
public class Principal{
    public static void main(String[] args) {
        // Essa linha cria uma nova instância da classe Lista, destinada a
        // armazenar objetos do tipo String, e a nomeia como "Alunos".
        //Lista de Alunos
        Lista<String> lista = new Lista<String>("Alunos");

        // Essa linha chama o método imprimeLista do objeto lista. Como
        // essa é a primeira chamada, e nenhum elemento foi adicionado
        // ainda, a saída será "Lista Vazia".
        lista.imprimeLista();
        // O método addInicio é chamado com o argumento "Rafael". Esse
        // método cria um novo nó contendo o dado "Rafael" e o insere no
        // início da lista. Como a lista estava vazia, esse nó se torna o
        // primeiro e o único nó da lista.
        lista.addInicio("Rafael");
        // Após adicionar "Rafael", o método imprimeLista imprime apenas o
        // dado desse nó.
        lista.imprimeLista();
        // Adiciona "Gabriel" no início da lista. Agora "Gabriel" se torna
        // o primeiro nó, e o nó que contém "Rafael" se torna o segundo.
        lista.addInicio("Gabriel");
        // Ao chamar imprimeLista, o método imprime os dados dos nós em
        // ordem: "Gabriel" (primeiro) e "Rafael" (segundo).
        lista.imprimeLista();
        // Adiciona "Danielly" no início da lista. Agora "Danielly" se
        // torna o primeiro nó, "Gabriel" o segundo, e "Rafael" o terceiro.
        lista.addInicio("Danielly");
        // Agora, a lista contém três elementos: "Danielly", "Gabriel" e
        // "Rafael", nessa ordem. O método imprime os dados dos três nós.
        lista.imprimeLista();

        // O método removeInicio é chamado para remover o primeiro nó da
        // lista. O método remove o nó que contém "Danielly" e o próximo nó
        // (que contém "Gabriel") se torna o novo primeiro nó.
        lista.removeInicio();
        // Após a remoção de "Danielly", a lista contém dois elementos:
        // "Gabriel" e "Rafael".
        lista.imprimeLista();
        // Remove o primeiro nó novamente: agora é "Gabriel" quem sai, e
        // "Rafael" se torna o novo (e único) primeiro nó.
        lista.removeInicio();
        // Após a remoção de "Gabriel", a lista contém apenas "Rafael".
        lista.imprimeLista();
        // Remove o último elemento restante ("Rafael"): a lista fica
        // vazia (primeiroNo e ultimoNo voltam a ser null).
        lista.removeInicio();
        // Com a lista vazia, imprimeLista volta a exibir "Lista Vazia".
        lista.imprimeLista();
        // Chamar removeInicio numa lista já vazia não quebra o programa:
        // o método apenas detecta que primeiroNo é null e exibe a
        // mensagem "LISTA VAZIA!", sem tentar remover nada.
        lista.removeInicio();


    }
}
