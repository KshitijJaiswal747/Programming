import java.util.*;

class HospitalBill
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        System.out.print("Enter ward type (Normal/ICU): ");
        String wardType = sc.next();

        System.out.print("Enter medicine bill: ");
        double medicineBill = sc.nextDouble();

        System.out.print("Enter consultation fee: ");
        double consultationFee = sc.nextDouble();

        System.out.print("Insured (Yes/No): ");
        String insured = sc.next();

        if(days < 0 || medicineBill < 0 || consultationFee < 0)
        {
            System.out.println("Invalid input");
        }
        else if(!wardType.equalsIgnoreCase("Normal") &&
                !wardType.equalsIgnoreCase("ICU"))
        {
            System.out.println("Invalid ward type");
        }
        else if(!insured.equalsIgnoreCase("Yes") &&
                !insured.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid insurance input");
        }
        else
        {
            double roomCharge;

            if(wardType.equalsIgnoreCase("Normal"))
            {
                roomCharge = days * 2000;
            }
            else
            {
                roomCharge = days * 5000;
            }

            double totalBill = medicineBill +
                               consultationFee +
                               roomCharge;

            double insuranceCover = 0;

            if(insured.equalsIgnoreCase("Yes"))
            {
                insuranceCover = totalBill * 0.70;

                if(insuranceCover > 50000)
                {
                    insuranceCover = 50000;
                }
            }

            double finalPay = totalBill - insuranceCover;

            System.out.println("Total Bill: ₹" + totalBill);
            System.out.println("Insurance Cover: ₹" + insuranceCover);
            System.out.println("Final Pay: ₹" + finalPay);
        }

        sc.close();
    }
}