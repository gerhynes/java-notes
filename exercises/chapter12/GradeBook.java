package chapter12;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        // Instantiate Maps declaring data types
        Map<String, Integer> grades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        // loop over makeUpGrades
        for(var student: makeUpGrades.entrySet()){
            // Access firstGrade using key of current student
            Integer firstGrade = grades.get(student.getKey());

            // Access secondGrade using key of current student
            Integer secondGrade = makeUpGrades.get(student.getKey());

            // Compare grades and keep higher
            if(secondGrade > firstGrade){
                grades.put(student.getKey(), secondGrade);
            }

            // Print out results
            System.out.println("Student: " + student.getKey() + ", Grade: " + grades.get(student.getKey()));
        }
    }
}
