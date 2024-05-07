<?php
$is_true = TRUE;
$is_false = FALSE;
echo gettype($is_true); 
echo gettype($is_false); 
$a = true;
$b = false;
$result_and = $a && $b;
$result_or = $a || $b; 
$negated_a = !$a; 
$result_xor = $a xor $b; 
?>
<br>
Result of logical AND: <?php echo $result_and; ?> <br>
Result of logical OR: <?php echo $result_or; ?> <br>
Negated value: <?php echo $negated_a; ?><br>
