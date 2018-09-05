function solution(arr) {

    let myArr = [];

    for (let element of arr) {

        let input = element.split(" ");
        let command = input[0];
        let num = Number(input[1]);

        switch (command) {

            case "add":
                myArr.push(num);
                break;
            case "remove":
                myArr.splice(num, 1);
                break;
        }

    }

    for(let item of myArr){
        console.log(item);
    }

}


solution([ 'add 3', 'add 5', 'remove 1', 'add 2' ]);