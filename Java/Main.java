abstract class Animal{
    public abstract void makeSound();
}
interface Flyable{
    public void fly();
}
class Lion extends Animal{
    public Lion(){}
    public void makeSound(){
        System.out.println("Lion Roars");
    }
}
class Eagle extends Animal implements Flyable{
    public Eagle(){}
    public void makeSound(){
        System.out.println("Eagle scream");
    }
    public void fly(){
        System.out.println("Eagle fly high");
    }
}
class Main{
    public static void main(String[]ar){
        Lion lion =new Lion();
        Eagle eagle=new Eagle();
        lion.makeSound();
        eagle.makeSound();
        eagle.fly();
        
    }
}
