import java.util.*;

class MobilePlan
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter call minutes: ");
        int mins = sc.nextInt();

        System.out.print("Enter data usage in GB: ");
        double gb = sc.nextDouble();

        System.out.print("Enter SMS count: ");
        int sms = sc.nextInt();

        if(mins < 0 || gb < 0 || sms < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            String bestPlan = "";
            double lowestCost = Double.MAX_VALUE;

            // Plan A
            double costA = 199;

            if(mins > 100)
                costA = costA + (mins - 100) * 1;

            if(gb > 2)
                costA = costA + (gb - 2) * 20;

            if(sms > 100)
                costA = costA + (sms - 100) * 0.50;

            if(costA < lowestCost)
            {
                lowestCost = costA;
                bestPlan = "Plan A";
            }

            // Plan B
            double costB = 299;

            if(mins > 300)
                costB = costB + (mins - 300) * 1;

            if(gb > 5)
                costB = costB + (gb - 5) * 20;

            if(sms > 300)
                costB = costB + (sms - 300) * 0.50;

            if(costB < lowestCost)
            {
                lowestCost = costB;
                bestPlan = "Plan B";
            }

            // Plan C
            double costC = 399;

            if(mins > 600)
                costC = costC + (mins - 600) * 1;

            if(gb > 10)
                costC = costC + (gb - 10) * 20;

            if(sms > 500)
                costC = costC + (sms - 500) * 0.50;

            if(costC < lowestCost)
            {
                lowestCost = costC;
                bestPlan = "Plan C";
            }

            // Plan D
            double costD = 499;

            if(mins > 1000)
                costD = costD + (mins - 1000) * 1;

            if(gb > 20)
                costD = costD + (gb - 20) * 20;

            if(sms > 1000)
                costD = costD + (sms - 1000) * 0.50;

            if(costD < lowestCost)
            {
                lowestCost = costD;
                bestPlan = "Plan D";
            }

            System.out.println("Recommended Plan: " + bestPlan);
            System.out.println("Total Cost: ₹" + lowestCost);
        }

        sc.close();
    }
}