<?php

echo "Conditional Statements<br><br>";

$counter = 1;
while ($counter < 11)
{
	//Generates random number
	$number = rand(1, 10);
	echo $number . ": ";
	
	if ($number % 2 == 0)
	{
		//Changes font to green if even and then black for next number
		echo "<font color = green> even<font color = black>";
	}
	else
	{
		//Changes font to red if odd and then black for next number
		echo "<font color = red> odd<font color=black>";
	}
	echo "<br>";
	$counter++;
}
