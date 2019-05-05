

<?php
$number1 = NULL;
$number2 = NULL;


// Checks if values are set & assigns them to variables
if ((isset($_POST['number1'])) && (isset($_POST['number2']))) {
    $number1 = $_POST['number1'];
    $number2 = $_POST['number2'];
} 


?>


<!-- Creates sticky form with 2 input fields & drop down box --> 
<html>
    <head>
        <meta charset="UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h2>Calculator</h2>
        <h4>Enter two numbers</h4>
        <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']);?>" method="POST">
            Number 1: <input type="=text" name="number1" value="<?php echo $number1; ?>"><br>
            Number 2: <input type="text" name="number2" value="<?php echo $number2; ?>"><br>
            <p>Select operation to be performed:</p>
       
            <!-- Makes drop down sticky by using echo selected -->
            <select name="operation">
                <option <?php if (isset($_POST['operation']) && $_POST['operation'] == "add") echo "selected"; ?> name="add" value="add">+</option>
                <option <?php if (isset($_POST['operation']) && $_POST['operation'] == "subtract") echo "selected"; ?> value="subtract">-</option>
                <option <?php if (isset($_POST['operation']) && $_POST['operation'] == "multiply") echo "selected"; ?> value="multiply">*</option>
                <option <?php if (isset($_POST['operation']) && $_POST['operation'] == "divide") echo "selected"; ?> value="divide">/</option>
            </select><br><br>
            <input type="submit" name="s" value="Calculate"><br><br>
            <?php
            if ((isset($number1)) && (isset($number2))) {
               
                // Checks for numeric entries
                if ((!is_numeric($number1)) || (!is_numeric($number2))) {
                    echo "ERROR: Both values must be numeric!<br>";
                } else {
                    if (isset($_POST['operation'])) {
                        $operation = $_POST['operation'];
                    }

            // Performs operation based on drop down selection
            switch ($operation) {
            case "add":
                
                echo "$number1 + $number2 = " . ($number1 + $number2);
                break;
            case "subtract":
                 echo "$number1 - $number2 =  " . ($number1 - $number2);
                break;
            case "multiply":
                echo "$number1 * $number2 = " . ($number1 * $number2);
                break;
            case "divide":
                // Displays divide by zero error message
                if ($number2 == 0) {
                  echo "ERROR: Number 2 must not be zero for division!<br>";  
                }
                else
                {
                   echo "$number1 / $number2 = " . ($number1 / $number2);
                }
                break;
            default:
                echo "ERROR: Operation cannot be performed!<br>";
                break;
            }
            } 
            }
        
            ?>
        </form>
    </body>
</html>


