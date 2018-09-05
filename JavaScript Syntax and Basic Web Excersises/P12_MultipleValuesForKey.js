function solution(arr) {

    let searchKey = arr[arr.length - 1];

    let result = {};


    for (let i = 0; i < arr.length - 1; i++) {

        let input = arr[i].split(" ");
        let key = input[0];
        let value = input[1];


        if (!result[key]) {
            result[key] = [];
            result[key].push(value);
        }
        else {
            result[key].push(value);
        }

    }


    if (result[searchKey] === undefined) {
        console.log("None");
    } else {

        let x = result[searchKey];

        for (let item of x) {
            console.log(item);
        }
    }


}


solution(['3 bla', '3 alb', '3']);