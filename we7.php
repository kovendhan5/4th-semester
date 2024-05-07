<?php
$x = true;
$y = false;
$result = $x && $y;

$a = true;
$b = false;
$output = $a || $b;

$value = false;
$negatedValue = !$value; 
?>

Result of logical AND: <?php echo $result; ?> <br>
Result of logical OR: <?php echo $output; ?> <br>
Negated value: <?php echo $negatedValue; ?><br>
