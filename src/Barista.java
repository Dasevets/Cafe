public class Barista extends Employee implements CoffeeВeans{


    public Barista(String name, int workExp){
        super(name, workExp);
    }

    @Override
    public void work() {
        System.out.println("Barista make coffee");
        checkCoffeeBeans();
    }


}
