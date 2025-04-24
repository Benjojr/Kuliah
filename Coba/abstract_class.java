public abstract class abstract_class{
    int roda;
    public void setRoda(int roda){
        this.roda = roda;
    }
}

class mobil extends abstract_class{
    public static void main(String[] args) {
        abstract_class anjay = new mobil();
        anjay.setRoda(4);
    }
}

