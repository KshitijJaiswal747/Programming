import java.util.*;

class Patient
{
    String name;
    int severity;

    public Patient(String name, int severity)
    {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Patient> patients =
            new PriorityQueue<>(
                new Comparator<Patient>()
                {
                    @Override
                    public int compare(
                        Patient p1,
                        Patient p2)
                    {
                        return Integer.compare(
                            p2.severity,
                            p1.severity
                        );
                    }
                }
            );

        patients.offer(
            new Patient("Rahul", 2)
        );

        patients.offer(
            new Patient("Amit", 5)
        );

        patients.offer(
            new Patient("Pooja", 1)
        );

        patients.offer(
            new Patient("Neha", 4)
        );

        System.out.println(
            "Patient Treatment Order:"
        );

        while (!patients.isEmpty())
        {
            Patient patient =
                patients.poll();

            System.out.println(
                patient.name
            );
        }
    }
}