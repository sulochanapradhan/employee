public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Sulochana",
                "VA", 37, 70000);
        Employee employeeTwo = new Employee("Prayan", "VA",
                26, 120000);

        employeeTwo.raiseSalary();

        BankAccount bankAccount = new BankAccount("valentina", 1000);

        bankAccount.withdraw(700);
        bankAccount.deposit(7000);
        bankAccount.withdraw(500);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);

    }
}
