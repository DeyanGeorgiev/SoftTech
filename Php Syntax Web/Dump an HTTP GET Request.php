<style>
    input[type="number"] {
        -moz-appearance: textfield;
    }

</style>


<form>
    <div>
        Name:
    </div>
    <input type="text" name="personName"/>
    <div>
        Age:
    </div>
    <input type="number"  name="personAge"/>
    <div>
        City:
    </div>
    <select name="town">
        <option value="1">
            Sofia
        </option>
        <option value="2">
            Varna
        </option>
        <option value="3">
            Burgas
        </option>
    </select>
    <div><input type="submit" /></div>
</form>

<?php

var_dump($_GET);
?>