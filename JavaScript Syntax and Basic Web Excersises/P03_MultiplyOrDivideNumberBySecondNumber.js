function solution(arr) {

    let num1 = Number(arr[0]);
    let num2= Number( arr[1]);

    let result = 0;

    if ( num2 >= num1){
        result = num2* num1;
    }else{
        result= num1/num2;
    }

    console.log(result);

}

solution(['144','12'])