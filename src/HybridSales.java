public class HybridSales extends Sales implements Reportable {
    private final int onsiteSales;
    private final int onlineSales;

    public HybridSales(String name, double baseSalary, int onsiteSales, int onlineSales) {
        super(name, baseSalary);
        this.onsiteSales = onsiteSales;
        this.onlineSales = onlineSales;
    }

    @Override
    public double calculateSalary() {
        return baseSalary 
            + (onsiteSales * 50000) 
            + (onlineSales * 30000);
    }

    @Override
    public void createReport() {
        System.out.println("Laporan Hybrid Sales oleh " + name);
    }
}
