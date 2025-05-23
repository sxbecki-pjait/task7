public class Snake extends Reptile{
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

    public void shedding(){
        System.out.println("Snake shedding");
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

}
