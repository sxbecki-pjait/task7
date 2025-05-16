public abstract class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }
    public void fly(){
        System.out.println("Bird flying");
    }
}
