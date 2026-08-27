// A classe Principal contém o método main, que é o ponto de entrada do
// programa.
public class Principal {

    public static void main(String[] args){

        // Aqui, um objeto do tipo No<String> é criado, armazenando o nome
        // Rafael. Como No é genérico, também é possível criar um
        // No<Pessoa>, armazenando um objeto Pessoa completo.
        No<String> obj = new No<String>("Rafael");
        No<Pessoa> objP = new No<Pessoa>(new Pessoa("Gabriel", 29, new Endereco("A", 10, "B")));


        //obj.setNextNo(obj1);

        // Aqui é criada a ligação entre os nós: obj é vinculado a um novo
        // nó "Cecília", que por sua vez é vinculado a um novo nó
        // "Joaquim". Isso forma uma lista encadeada de 3 elementos.
        obj.setNextNo(new No<String>("Cecília"));
        obj.getNextNo().setNextNo(new No<String>("Joaquim"));
        /*
        System.out.println(obj.getDado());
        System.out.println(obj.getNextNo().getDado());
        System.out.println(obj.getNextNo().getNextNo().getDado());

        */

        // Esse trecho de código percorre a lista encadeada a partir de obj
        // até o final (onde nextNo é null). Em cada iteração, ele imprime
        // o valor do nó atual e avança para o próximo nó usando
        // getNextNo. O loop while continua até que aux seja null,
        // indicando o final da lista.
        No<String> aux = obj;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }

        System.out.println(objP.getDado().toString());
    }
}
