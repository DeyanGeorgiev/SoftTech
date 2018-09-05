<style>
    div {
        font-family: "Comic Sans MS";
        font-size: large;
        color: deeppink;
    }

</style>

<body style="background: aquamarine ">

    <?php

    if (isset($_GET["person"])) {

        $person = htmlspecialchars($_GET["person"]);
        echo "<div> Hello, $person ! </div>";
    } else {

   ?>

    <form>
        Name: <input type="text" name="person"/>
        <input type="submit"/>

        <?php } ?>



</form>
</body>
