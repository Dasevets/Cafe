public class Cook extends Employee{

    public Cook(String name, int workExp){
        super(name, workExp);
    }

    @Override
    public void work() {
        System.out.println("Cook make food:");
        Cooking cooking = new Cooking(1);
    }

    class Cooking{
        public Cooking(int number){
            switch (number){
                case 1:
                    System.out.println("Make Irish stew");
                    break;
                case 2:
                    System.out.println("Make steak");
                    break;
                case 3:
                    System.out.println("Make compliment from the chef");
                    break;
            }
        }
    }
}
