package session6.assignment;
class PayrollAccount{
    private double basicSalary;
    private double bonus;
    public PayrollAccount(double basicSalary){
        if(basicSalary<0){
            System.out.println("Invalid Basic Salary! Setting Basic Salary to 0");
            this.basicSalary=0;
        }
        else
            this.basicSalary=basicSalary;
    }
    public void creditBonus(double amount){
        if(amount<=0){
            System.out.println("Invalid Bonus Amount!");
            bonus=0;
        }
        else{
            bonus=amount;
            System.out.println("Bonus credited: "+bonus);
        }
    }
    public void deductTax(double percent){
        if(percent<0||percent>100)
            System.out.println("Invalid Percentage for Deduct Tax!");
        else{
            System.out.println("Tax deducted: "+percent+"%");
            basicSalary=basicSalary-(basicSalary*percent*0.01);
        }
    }
    public void getNetSalary(){
        System.out.println("Net salary: "+(basicSalary+bonus));
    }
}
public class PayrollSalaryManagement {
    public static void main(String[] args) {
        PayrollAccount p=new PayrollAccount(50000);
        p.creditBonus(5000);
        p.deductTax(10);
        p.getNetSalary();
    }
}
