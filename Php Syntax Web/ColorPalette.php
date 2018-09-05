<style>
    div {
        display: inline-block;
        width: 150px;
        padding: 2px;
        margin: 5px;
        font-family: "Comic Sans MS";
    }

</style>
<head>
    <body>
<?php

for ($r=0; $r<=255; $r+=51){
    for ($g=0; $g<= 255; $g+=51){
        for ($b=0; $b<=255; $b+=51){

            $color = "rgb($r, $g, $b)";


            echo "<div style='background:$color'>$color</div>\n";

        }
    }
}
?>
</body>
</head>





