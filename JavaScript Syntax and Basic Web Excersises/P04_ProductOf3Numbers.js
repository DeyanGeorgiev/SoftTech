function solution(arr) {

    let num1 = arr[0].toString();
    let num2 = arr[1].toString();
    let num3 = arr[2].toString();

    if (num1.includes('-') && !num2.includes('-') && !num3.includes('-')) {
        console.log('Negative');
    }
    else if (num2.includes('-') && !num1.includes('-') && !num3.includes('-')) {
        console.log('Negative');
    }
    else if (num3.includes('-') && !num1.includes('-') && !num2.includes('-')) {
        console.log('Negative');
    }
    else {
        console.log('Positive');
    }

}

solution([2,
    3,
    11,
]);