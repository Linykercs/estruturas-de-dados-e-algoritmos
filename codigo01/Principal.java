public class Principal {
    public static void main(String[] args) {
        No<String> obj = new No<String>("Linyker");


        obj.setNextNo(new No("Cecilia"));
        obj.getNextNo().setNextNo(new No("Pedro"));
    
        No aux = obj;
        
        while (aux != null) { 
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
    }
}