function solution(arr) {

    let length = Number(arr[0]);

    let myArr = [];

    for (let i = 0; i < length; i++) {
        myArr[i] = 0;
    }


    for (let i = 1; i < arr.length; i++) {

        let input = arr[i].split(" - ");
        let index = input[0];
        let value = input[1];


        myArr.splice(index, 1, value);

    }

    for (let element of myArr) {
        console.log(element)
    }


}

solution(['5', '0 - 3', '3 - -1', '4 - 2']);