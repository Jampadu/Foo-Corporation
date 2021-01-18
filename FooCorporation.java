public class FooCorporation {
    
    public static void TotalPay(double basePay, double hoursWorked)
    {
        double total;// total pay
        double surplus; //additional hours after 40
        double surplusBasePay; //pay for surplus hours
        
        if(hoursWorked > 60)
        {
            System.out.println("Error!!! Maximum hours worked is 60 hours.");
        }
        else
        {
            if(basePay < 8)
            {
                System.out.println("Error!!! Minimum wage is $8 per hour.");
            }
            else
            {
                if(hoursWorked > 40)
                {
                    surplus = hoursWorked - 40;

                    total = 40 * basePay; 
                    surplusBasePay = 1.5 * basePay;

                    surplus = surplus * surplusBasePay;

                    total = total + surplus;

                    System.out.println("Total Salary is $"+total);
                }
                else
                {
                    total = hoursWorked * basePay;
                    System.out.println("Total Salary is $"+total);
                }
            }
        }
    }
    

    
}
