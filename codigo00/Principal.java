// Essas linhas de código importam as classes Scanner e ArrayList das
// bibliotecas Java. O Scanner é utilizado para entrada de dados, enquanto
// o ArrayList é uma coleção que permite armazenar objetos de forma
// dinâmica.
import java.util.Scanner;
import java.util.ArrayList;

// Define a classe Principal. Em Java, toda aplicação começa com a
// definição de uma classe. O nome da classe deve ser o mesmo do arquivo
// .java correspondente.
public class Principal{
    // Este é o método principal (main), onde a execução do programa
    // começa. É um método estático, o que significa que pode ser chamado
    // sem a necessidade de criar uma instância da classe Principal.
    public static void main(String[] args){

        // Cria um objeto Scanner para ler a entrada do usuário a partir do
        // console. O System.in especifica que a entrada será lida do
        // console.
        Scanner input = new Scanner(System.in);

        // Cria uma ArrayList que armazenará objetos do tipo Pessoa. O
        // ArrayList é uma coleção dinâmica que pode crescer conforme novos
        // elementos são adicionados.
        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        // Cria novos objetos da classe Pessoa, cada um utilizando um
        // construtor diferente (padrão, com nome/idade, e completo com
        // Endereco).
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Rafael", 35);
        Pessoa obj3 = new Pessoa();
        Pessoa obj4 = new Pessoa("Gabriel", 29, new Endereco("A", 1, "B"));

        // Essas linhas exibem uma mensagem solicitando o nome da pessoa e,
        // em seguida, leem a entrada do usuário.
        System.out.print("Digite o nome: ");
        obj3.setNome(input.nextLine());
        //String nome = input.nextLine();
        // Solicita a idade da pessoa e lê o valor como um inteiro.
        System.out.print("Digite a idade: ");
        //int idade = input.nextInt();
        obj3.setIdade(input.nextInt());

        //obj3.setNome(nome);
        //obj3.setIdade(idade);

        //System.out.println(obj1.toString());
        //System.out.println(obj2.toString());
        //System.out.println(obj3.toString());

        // Adiciona os objetos Pessoa à lista, incluindo obj3 que acabou de
        // ser preenchido com os dados digitados pelo usuário.
        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);
        listaP.add(obj4);

        // Este laço for-each percorre cada objeto Pessoa na lista e exibe
        // as informações usando o método toString.
        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }

        /*
        listaP.get(0).setNome("Joaquim");
        listaP.get(0).setIdade(1);
        System.out.println(listaP.get(0).toString());
        System.out.println(obj1.toString());
        */

        // Como obj4 é um objeto (tipo referência), obj4 e o item
        // correspondente dentro de listaP apontam para o mesmo objeto na
        // memória: alterar obj4 aqui também altera o que está guardado
        // dentro da lista.
        obj4.setNome("Joaquim");
        obj4.setIdade(1);
        obj4.getEnd().setRua("R");
        obj4.getEnd().setNumero(8);
        obj4.getEnd().setBairro("Centro");

        System.out.println(obj4.toString());

        input.close();
    }
}
