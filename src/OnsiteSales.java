public class OnsiteSales extends Sales implements Reportable {
    private final int totalSales;
    private final double transportAllowance = 500000;

    public OnsiteSales(String name, double baseSalary, int totalSales) {
        super(name, baseSalary);
        this.totalSales = totalSales;
    }

    @Override
    public double calculateSalary() {
        double commission = totalSales * 50000;
        return baseSalary + commission + transportAllowance;
    }

    @Override
    public void createReport() {
        System.out.println("Laporan Onsite Sales oleh " + name);
    }
}
