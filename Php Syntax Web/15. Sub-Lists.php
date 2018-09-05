<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num1" />
        M: <input type="text" name="num2" />
        <input type="submit" />
    </form>
	<ul>
        <?php

        if ( isset($_GET['num1']) && isset($_GET['num2'])){

            $num1= intval($_GET['num1']);
            $num2= intval($_GET['num2']);

            for ($l =1; $l<= $num1; $l++ ){

                echo "<li>List {$l}";
                echo "<ul>";

                for ($e= 1; $e<= $num2; $e++){

                    echo "<li>";
                    echo "Element {$l}.{$e}";
                    echo "</li>";


                }

                echo "</ul>";
                echo "</li>";

            }
        }


        ?>
	</ul>
</body>
</html>