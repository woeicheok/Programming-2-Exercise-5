import java.util.*;
    class Employee{
       int employeeIDnumber; 
       double grossPay, stateTax, federalTax;
    
    public void input(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your employee ID number: ");
        employeeIDnumber = in.nextInt();
        System.out.print("Enter your Gross Pay:RM ");
        grossPay = in.nextDouble();
        System.out.print("Enter your State Tax:RM ");
        stateTax = in.nextDouble();
        System.out.print("Enter your Federal Tax:RM ");
        federalTax = in.nextDouble();
    }
}
    class Payroll{
        private double netPay, grossPay, stateTax, federalTax;
        
        public Payroll(double grossPay, double stateTax, double federalTax){
            this.grossPay = grossPay;
            this.stateTax = stateTax;
            this.federalTax = federalTax;
        }
        public double calculateNetPay(){
            netPay = grossPay - stateTax - federalTax;
            return netPay;
        }
        public void printOutput(){
            System.out.printf("Net pay is : RM %.2f",calculateNetPay());
        }
}
       
    public class Ex5_Task3_PayrollDemo {
      public static void main(String[] args){
             Employee eply = new Employee();
             eply.input();
             Payroll pr = new Payroll(eply.grossPay, eply.stateTax, eply.federalTax);
             pr.printOutput();
    }  
}