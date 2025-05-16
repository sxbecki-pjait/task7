public class Penguin extends Bird{
    private String colors;
    public Penguin(String name, int age, String colors){
        super(name, age);
        this.colors = colors;
    }
    @Override
    public void makeSound() {
        System.out.println("honk");
    }

    @Override
    public void move() {
        System.out.println("Penguin moves");
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Colors: " + colors);
    }

    @Override
    public void fly(){
        System.out.println("Penguin can't fly, so sad");
    }

    public String getColors() {
        return colors;
    }
    public void setColors(String colors) {
        this.colors = colors;
    }
}
