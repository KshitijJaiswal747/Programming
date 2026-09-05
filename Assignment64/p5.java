import java.util.*;

class Student
{
    String name;
    int marks;

    public Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String toString()
    {
        return name + " " + marks;
    }
}

public class StudentSorting
{
    public static void main(String[] args)
    {
        ArrayList<Student> students =
            new ArrayList<>();

        students.add(
            new Student("Amit", 78)
        );

        students.add(
            new Student("Pooja", 92)
        );

        students.add(
            new Student("Rahul", 85)
        );

        students.add(
            new Student("Neha", 92)
        );

        students.add(
            new Student("Kiran", 67)
        );

        Collections.sort(
            students,
            new Comparator<Student>()
            {
                @Override
                public int compare(
                    Student s1,
                    Student s2)
                {
                    // Descending marks
                    if (s1.marks != s2.marks)
                    {
                        return s2.marks -
                               s1.marks;
                    }

                    // Alphabetical name
                    return s1.name.compareTo(
                        s2.name
                    );
                }
            }
        );

        System.out.println(
            "Students according to marks:"
        );

        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}