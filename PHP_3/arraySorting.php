<?php

$students = array(
 "1234567" => array("FName" => "Brendan", "LName" => "Wood", "GPA" => 3.4),
 "2345678" => array("FName" => "Nathalie", "LName" => "Smith", "GPA" => 3.34),
 "3456789" => array("FName" => "John", "LName" => "Doe", "GPA" => 2.7),
 "4567890" => array("FName" => "Sammy", "LName" => "Singh", "GPA" => 3.7),
 "5678901" => array("FName" => "Sarah", "LName" => "Dubois", "GPA" => 3.5),
 "6789012" => array("FName" => "Emma", "LName" => "Smith", "GPA" => 4.0),
);

$students_sorted_by_ID = $students;

$students_sorted_by_GPA = $students;

// User defined sort by keys 
uksort($students_sorted_by_ID, "fcn_sort_by_id");

function fcn_sort_by_id($a, $b) {
    if ($a == $b) {
        return 0;
    }
    if ($a > $b) {
        return 1;
    } else {
        return -1;
    }
        
    }

// User defined sort by values
uasort($students_sorted_by_GPA, "fcn_sort_by_gpa");
        
 function fcn_sort_by_gpa($a, $b) {
     if ($a['GPA'] == $b['GPA']){
         return 0;
     }
     if ($a['GPA'] > $b['GPA']) {
         return 1;
     } else {
         return -1;
     }
 }
 
// Display all arrays in table format
display_results($students, "Original Array");
display_results($students_sorted_by_ID, "Array Sorted by ID");
display_results($students_sorted_by_GPA, "Array Sorted by GPA");
 
 

 function display_results($a, $title) {
     echo "<h2>$title</h2>";
     echo "<table border= 1>\n";
     echo "<th>ID</th><th>First Name</th><th>Last Name</th><th>GPA</th>";

     
     foreach($a as $arraykey => $arrayitem) {
         echo "<tr><td>$arraykey</td><td>$arrayitem[FName]</td><td>$arrayitem[LName]</td><td>$arrayitem[GPA]</td></tr>\n";
     }
     echo "</table>";
 }
