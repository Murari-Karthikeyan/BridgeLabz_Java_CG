public class ZaraEmployeeBonus {

    // Method to generate salary and years of service
    // Column 0 → Salary, Column 1 → Years of Service
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // Generate 5-digit salary (10000–99999)
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // Generate years of service (1–10)
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → Old Salary
    // Column 1 → Bonus
    // Column 2 → New Salary
    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] salaryDetails = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            salaryDetails[i][0] = oldSalary;
            salaryDetails[i][1] = bonus;
            salaryDetails[i][2] = oldSalary + bonus;
        }
        return salaryDetails;
    }

    // Method to calculate totals and display results
    public static void displaySummary(
            double[][] employeeData, double[][] salaryDetails) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp  OldSalary  Years  Bonus     NewSalary");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = salaryDetails[i][0];
            double bonus = salaryDetails[i][1];
            double newSalary = salaryDetails[i][2];
            double years = employeeData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf(
                    "%3d  %9.0f  %5.0f  %8.2f  %10.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary
            );
        }

        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL %9.0f        %8.2f  %10.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        // Step 1: Generate employee salary and service data
        double[][] employeeData = generateEmployeeData(employees);

        // Step 2: Calculate bonus and new salary
        double[][] salaryDetails = calculateBonus(employeeData);

        // Step 3: Display tabular summary
        displaySummary(employeeData, salaryDetails);
    }
}
