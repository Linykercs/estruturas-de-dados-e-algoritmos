public class No<T> {
    private T dado;
    private No nextNo;

    public No() {
        this(null,null);
    }

    public No(T dado) {
        this(dado,null);
    }

    public No (T dado, No nextNo){
        this.dado = dado;
        this.nextNo = nextNo;

    }

    
    public void setDado(T dado) {
        this.dado = dado;
    }

    
    public T getDado() {
        return this.dado;
    }
    
     public void setNextNo(No nextNo) {
        this.nextNo = nextNo;
    }
   
    public No getNextNo() {
        return this.nextNo;
    }
}