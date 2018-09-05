<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET["num"])) {
    $n = intval($_GET["num"]);

    $oneNum = 1;
    $twoNum = 1;

    echo "1 1 ";

    for ($i = 2; $i < $n; $i++) {

        $sum = $oneNum + $twoNum;
        echo "{$sum} ";

        $oneNum = $twoNum;
        $twoNum = $sum;


    }
}
?>
</body>
</html>