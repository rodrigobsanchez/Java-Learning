package OOInheritanceConstructors;

public class Dog extends Animal {


    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    public void bark(){
        System.out.println("Woof");
    }

    public void bark(int n){
        for(int i = 0; i < n ; i++){
            System.out.println("Woof");
        }
        System.out.println("Overloading the bark method");
    }


    public void barkAnimal(){
       super.bark();
    }

    //Overrides the native toString method from 'Mother class' Object and is orverriden from GermansSheperd class
    public String toString(){
        return String.format("Nome: %s, Tamanho: %d, Peso: %d", super.getName(), super.getSize(), super.getWeight());
    }
}
