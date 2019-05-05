<?php

echo "String Manipulation<br><br>";

$sourceText =  'This is your input string';

//String forward
echo "String: " . substr($sourceText, 0) . "<br>";

echo "<br>String reversed: ";

//String in reverse with decremented for loop
for ($i = strlen($sourceText) - 1 ; $i >= 0; $i--)
{
	echo $sourceText[$i];
}

