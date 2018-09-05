<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>


<?php

for ($raw = 0; $raw <= 8; $raw++) {
    for ($col = 0; $col <= 4; $col++) {

        if ($raw == 0 || $raw == 4 || $raw == 8) {

            echo "<button style='background-color: blue' >1</button>";

        }
        if ($raw >= 1 && $raw < 4 && $col == 0) {

            echo "<button style='background-color: blue'>1</button>";


        }
        if ($raw >= 1 && $raw < 4 && $col != 1) {

            echo "<button >0</button>";
        }

        if ($raw >= 5 && $raw <= 7 && $col != 4) {

            echo "<button >0</button>";
        }
        if ($raw >= 5 && $raw <= 7 && $col == 4) {

            echo "<button style='background-color: blue'>1</button>";


        }


    }
    echo "<br>";
}


?>

</body>
</html>