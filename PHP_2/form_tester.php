<?php 
// Declares variables
$fname;
$lname;
$address;
?>

<!-- Creates self-posting form -->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Information</title>
    </head>
    <body>
        <h3>Information</h3>
        <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']);?>" method="GET">
            First name: <input type="text" name="fname"><br>
            Last name: <input type="text" name="lname"><br>
            Address: <input type="text" name="address"><br>
            <input type="submit" value="Submit">
        </form>


<?php
// Checks if it is a get & assigns values to variables
if($_SERVER['REQUEST_METHOD'] == "GET") {
    if(isset($_GET['fname']) && (isset($_GET['lname']) && (isset($_GET['address'])))) {
        $first = $_GET['fname'];
        $last = $_GET['lname'];
        $address = $_GET['address'];
        
        if (empty($first) || empty($last))
        {
            echo "Values must be provided!";
        }
    } 
}

// Prints if page is GET or POST
print_r($_SERVER['REQUEST_METHOD']);

// Creates table of GET values
print "<table>\n";
print '<tr><th>Key</th><th>Value</th></tr>';
foreach ($_GET as $key => $value) {
    print "<tr><td>$key</td><td>$value</td></tr>\n";
}
print '</table>';

if ($_SERVER['REQUEST_METHOD'] !== "GET") {
    echo "No GET Values present!";
}

?>
</body>
</html>