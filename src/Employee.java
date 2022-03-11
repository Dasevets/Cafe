public abstract class Employee {
    private String name;
    private int workExp;

    public Employee(String name, int workExp){
        this.name = name;
        this.workExp = workExp;
    }

    public abstract void work();
}
