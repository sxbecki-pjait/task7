public class Snake extends Animal{
    private int length;
    public Snake(String name, int age, int length) {
        super(name, age);
        this.length = length;
    }

    @Override
    public void makeSound() {
        System.out.println("Hsssssssss");
    }

    @Override
    public void move() {
        System.out.println("Snake moves");
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Length in cm: " + length);
    }
}
