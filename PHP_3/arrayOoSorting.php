<?php

// Creates the student class
class Student {
    private $ID;
    private $FName;
    private $LName;
    private $GPA;
    
    function __construct($ID, $FName, $LName, $GPA) {
        $this->ID = $ID;
        $this->FName = $FName;
        $this->LName = $LName;
        $this->GPA = $GPA;
    }
    
    function getID() {
        return $this->ID;
    }
    
    function getFName() {
        return $this->FName;
    }
    
     function getLName() {
        return $this->LName;
    }
    
    function getGPA() {
        return $this->GPA;
    }
    
}


// Creates the students class
class Students {
    
    
    private $studentArray = array();
    
    // Function at add students to an array
    function AddStudent(Student $s) {
        array_push($this->studentArray, $s);
    }
    
    
    // Prints student information in a table
    function __toString() {
        $returnVal = "";
      
       
       $returnVal.= "<table border=1>\n";
       $returnVal.= "<th>ID</th><th>First Name</th><th>Last Name</th><th>GPA</th>";
       // Loops through student array
       foreach ($this->studentArray as $student) {
           $returnVal .= "<tr><td>".$student->getID()."</td><td>".$student->getFName()."</td><td>".$student->getLName()."</td><td>".$student->getGPA()."</td></tr>";
       }
       
       $returnVal.= "</table>";
       return $returnVal;
    }

    // User defined sort of GPA
    public function SortMe() {
        usort($this->studentArray, "Students::sortFunction");
    }


function sortFunction($a, $b) {
    if ($a->getGPA() == $b->getGPA()) {
        return 0;
    }
    if ($a->getGPA() > $b->getGPA()) {
        return 1;
    } else {
        return -1;
    }
    }
    }
    
   // Prints title with initial capital letters
    function echoTitle($str) {
        
        $str = ucfirst($str);
          echo "<h2>$str</h2>";
    }


// Creates students
$student_1 = new Student(1234567, "Brendan", "Wood", 3.4);
$student_2 = new Student(2345678, "Nathalie", "Smith", 3.34);
$student_3 = new Student(3456789, "John", "Doe", 2.7);
$student_4 = new Student(4567890, "Sammy", "Singh", 3.7);
$student_5 = new Student(5678901, "Sarah", "Dubois", 3.5);
$student_6 = new Student(6789012, "Emma", "Smith", 4);

//$students type:: students;

$students = new Students();
$students->AddStudent($student_1);
$students->AddStudent($student_2);
$students->AddStudent($student_3);
$students->AddStudent($student_4);
$students->AddStudent($student_5);
$students->AddStudent($student_6);

echoTitle("Original OO Student List");
echo $students;


echoTitle("Sorted OO Student List by GPA");
$students->SortMe();
echo $students;