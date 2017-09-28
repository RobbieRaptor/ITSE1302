import java.util.Scanner;
class averageCalc{
    public static void main(String[] args){
    /** create a program that calculates the average of multiple list
     and prints there average along with the correct letter grade **/
    /** 
        Must create at least five different lists and each list must have at least five items in it. Your application must print at least five lines showing each of the individual letter grades, average, and student name for each list.
        Must use variables, control structures, and looping structures.
        Must use any or all of the following collection types (List, Map, Array).
        Code must be documented via comments
        Use git commits at your discretion. Commit message must be descriptive.**/
   println("Hello this program will calculate students averages, and print out a letter grade");
   
  // create variables for the five kids
   def sam;
   def john;
   def bill;
   def sally;
   def judy;
 
  //create the varibles for the letter grades 
   def A <= 100; // keep getting a compiler error for some reason
   def B <= 89;
   def C <= 79;
   def D <= 69;
   def F <= 59; 
   
  // average up the grades for the students
   int samsAverage = ("+samsGrades list.value.sum(/5)");// not sure if this is the correct way to do this, this is what I reseached on the internet -Rob
   int johnsAverage = ("+johnsGrades list.value.sum(/5)");
   int billsAverage = ("+billsGrades list.value.sum(/5)");
   int sallysAverage = ("+sallysGrades list.value.sum(/5)");
   int judysAverage = ("+judysGrades list.value.sum(/5)");
    
  // create list of students and their grades
   int samsGrades = [70, 85, 90, 65, 75];
   int johnsGrades = [50, 65, 80, 70, 90];
   int billsGrades = [80, 85, 85, 90, 100];
   int sallysGrades = [95, 95, 100, 100, 90];
   int judysGrades = [100, 100, 75, 95, 100];
   
  // create an If else statement for Sams average.
   if (+samsAverage <= 100){
       println "Student: $sam $A $samsAveage"
       }
      
   else if (+samsAverage <= 89){
       println "student: $sam $B $samsAverage"
       }
       
   else if (+samsAverage <= 79){
       println "student: $sam $C $samsAverage"
       } 
       
   else if (+samsAverage <= 69){
       println "student: $sam $D $samsAverage"
       }
       
   else if (+samsAverage <= 59){
       println "student: $sam $F $samsAverage"
       } 
       
  //Create an if/else if statements for Johns Grade average
   
    if (+johnsAverage <= 100){
       println "Student: $john $A $johnsAveage"
       }
      
   else if (+johnsAverage <= 89){
       println "student: $john $B $johnsAverage"
       }
       
   else if (+johnsAverage <= 79){
       println "student: $john $C $johnsAverage"
       } 
       
   else if (+johnsAverage <= 69){
       println "student: $john $D $johnsAverage"
       }
       
   else if (+johnsAverage <= 59){
       println "student: $john $F $johnsAverage"
       } 
       
  //create an if/ else statements for bills average
  
     if (+billsAverage <= 100){
       println "Student: $bill $A $billsAveage"
       }
      
   else if (+billsAverage <= 89){
       println "student: $bill $B $billsAverage"
       }
       
   else if (+billsAverage <= 79){
       println "student: $bill $C $billsAverage"
       } 
       
   else if (+billsAverage <= 69){
       println "student: $bill $D $billsAverage"
       }
       
   else if (+billsAverage <= 59){
       println "student: $bill $F $billsAverage"
       } 
  // Create if/ else statements for Sallys average
  
   if (+sallysAverage <= 100){
       println "Student: $sally $A $sallysAveage"
       }
      
   else if (+sallysAverage <= 89){
       println "student: $sally $B $sallysAverage"
       }
       
   else if (+sallysAverage <= 79){
       println "student: $sally $C $sallysAverage"
       } 
       
   else if (+sallysAverage <= 69){
       println "student: $sally $D $sallysAverage"
       }
       
   else if (+sallysAverage <= 59){
       println "student: $sally $F $sallysAverage"
       }
        
   // Create if/ else if staments for judys Average
   
    if (+judysAverage <= 100){
       println "Student: $judy $A $judysAveage"
       }
      
   else if (+judysAverage <= 89){
       println "student: $judy $B $judysAverage"
       }
       
   else if (+judysAverage <= 79){
       println "student: $judy $C $judysAverage"
       } 
       
   else if (+judysAverage <= 69){
       println "student: $judy $D $judysAverage"
       }
       
   else if (+judysAverage <= 59){
       println "student: $judy $F $judysAverage"
       }       
          }
  
      }
