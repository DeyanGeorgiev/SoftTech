function solution(arr) {
    let result = {};


    for (let i = 0; i < arr.length; i++) {

        let input = arr[i].split(' -> ');
        let key = input[0];
        let value = input[1];

        if (isNaN(Number(value))) {
            result[key] = value;
        } else {
            result[key] = Number(value);
        }
    }

    console.log(JSON.stringify(result));

}

solution(['name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia',
])