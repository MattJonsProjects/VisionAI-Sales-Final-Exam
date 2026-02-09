public abstract class Sales {
    protected String name;
    protected double baseSalary;

    public Sales(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}
