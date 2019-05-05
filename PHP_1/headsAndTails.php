<?php

echo "Heads and Tails<br><br>";

$rolls = 0;//Counts number of rolls
$counterHeads = 0;//Counts number of heads rolled
$counterTails = 0;//Counts number of tails rolled

//Performs up to 20 rolls
while ($rolls < 20) {
    $number = rand(1, 2);//Generates random number 1 ("Heads") or number 2 ("Tails")
    if ($number == 1) {
        echo "H, ";
        $counterHeads++;
        $counterTails = 0;
    }
     
   else {
        echo "T, ";
        $counterTails++;
        $counterHeads = 0;
    }
     
    $rolls++;// Increments rolls
    
    //Prints message when 3 consecutive heads or tails are rolled
    if (($number == 1) && ($counterHeads == 3)) {
        echo "<br>It took " . $rolls . " rolls to achieve " . $counterHeads . " heads in a row.";
        break;
    }
    
    if (($number == 2) && ($counterTails == 3)) {
        echo "<br>It took " . $rolls . " rolls to achieve " . $counterTails . " tails in a row.";
        break;
    }
}

//Prints message after 20 rolls 
 if (($counterHeads < 3) && ($counterTails < 3))  {
    echo "<br>After " . $rolls . " rolls, 3 heads or tails in a row was never achieved.";
}
 
 




