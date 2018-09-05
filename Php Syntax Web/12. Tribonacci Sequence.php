<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if (isset($_GET["num"])) {
        $n = intval($_GET["num"]);

        $oneNum = 1;
        $twoNum = 1;
        $triNum= 2;

        echo "1 1 2 ";

        for ($i = 3; $i < $n; $i++) {

            $sum = $oneNum + $twoNum+ $triNum;
            echo "{$sum} ";

            $oneNum = $twoNum;
            $twoNum = $triNum;
            $triNum= $sum;


        }
    }

    ?>
</body>
</html>