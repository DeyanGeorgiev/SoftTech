function solution(arr) {

let input = arr.map(Number).reverse();

    for (let item of input) {
        console.log(item);
    }
}

solution([ '5', '5.5', '24', '-3' ])