package OOInheritanceConstructors;

public class GermanSheperd extends Dog {

    private String managingSheeps;

    public GermanSheperd(String name, int brain, int body, int size, int weight, String s) {
        super(name, brain, body, size, weight);
        this.managingSheeps = s;
    }

    //As the symbol on the left says this methods overrides the bark() from Dog class the 'ascendant' class on the inheritance hierarchy.
    public void bark(){
        System.out.println("Woof from Germany");
    }

    public String toString(){
        return String.format("Nome: %s, Tamanho: %d, Peso: %d, Lema: %s", super.getName(), super.getSize(), super.getWeight(), this.managingSheeps);
    }
    public String getManagingSheeps() {
        return managingSheeps;
    }


}
