package chapterThree;

public class Employee {
    private String firstname;
    private String lastname;
    private double salary;



    public Employee(String theFirstName, String theLastName, double workSalary) {
        this.firstname = theFirstName;
        this.lastname = theLastName;

        if(workSalary > 0){
        this.salary = workSalary;
        }
        else if ( workSalary < 0){
            this.salary = 0;
        }
    }


    public double getSalary() {
        return salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(double workSalary) {
    this.salary = workSalary;
    }

    public double annualSalary(){
        double annualSalary = salary * 12;
        return annualSalary;
    }

    public double increaseSalary(){
        double workSalaryIncrease = salary * 0.1;
        double newMonthlySalary = salary + workSalaryIncrease;
        double newAnnualSalary = newMonthlySalary * 12;
        return newAnnualSalary;
    }
}
