function solution(arr) {

    let arry = arr;

    for (let item of arry) {


        if (item.includes("Stop") === false) {
            console.log(item);

        }
        else {
            break;
        }


    }


}


solution();