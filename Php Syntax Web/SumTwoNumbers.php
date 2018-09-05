<?php

if (isset($_GET["num1"]) && isset($_GET["num2"])) {
    $num1 = intval($_GET["num1"]);
    $num2 = intval($_GET["num2"]);

    $sum = $num1 + $num2;

    echo "$num1 + $num2 = $sum";
}

?>


<form>
    <div>Number1</div>
    <input type="number" step="any" name="num1"/>
    <div>Number2</div>
    <input type="number" step="any" name="num2"/>
    <div><input type="submit"/></div>

</form>