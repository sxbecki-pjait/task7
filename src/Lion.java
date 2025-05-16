public class Lion extends Animal {
    private boolean newTrim;

    public Lion(String name, int age, boolean newTrim) {
        super(name, age);
        this.newTrim = newTrim;
    }

    @Override
    public void makeSound() {
        System.out.println("Raawr");
    }

    @Override
    public void move() {
        System.out.println("Lion moves");
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Does it have new trim?:" + newTrim);
    }

    public boolean getNewTrim() {
        return newTrim;
    }
}
