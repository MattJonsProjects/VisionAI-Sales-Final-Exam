public class Main {
    public static void main(String[] args) {

        Sales s1 = new OnsiteSales("Andi", 4000000, 10);
        Sales s2 = new HybridSales("Budi", 4500000, 5, 20);

        System.out.println("Gaji Andi: Rp " + s1.calculateSalary());
        System.out.println("Gaji Budi: Rp " + s2.calculateSalary());

        ((Reportable) s1).createReport();
        ((Reportable) s2).createReport();
    }
}
