import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StudentGrades {
public static void main(String[] args) {
ArrayList<Integer> grades = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter student grades (enter -1 to finish):");
while (true) {
System.out.print("Enter grade: ");
int grade = scanner.nextInt();
if (grade == -1) {
break;
}
if (grade < 0 || grade > 100) {
System.out.println("Invalid grade. Please enter a value between 0 and 100.");
} else {
grades.add(grade);
}
}
if (grades.isEmpty()) {
System.out.println("No grades were entered.");
} else {
double average = calculateAverage(grades);
int highest = Collections.max(grades);
int lowest = Collections.min(grades);
System.out.println("Total students: " + grades.size());
System.out.printf("Average grade: %.2f\n", average);
System.out.println("Highest grade: " + highest);
System.out.println("Lowest grade: " + lowest);
}
scanner.close();
}
private static double calculateAverage(ArrayList<Integer> grades) {
int sum = 0;
for (int grade : grades) {
sum += grade;
}
return (double) sum / grades.size();
}
}
