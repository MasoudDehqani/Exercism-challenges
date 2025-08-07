public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 1.0 - 0.15 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double sal = 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return sal <= 2000.0 ? sal : 2000.0;
    } 
}
