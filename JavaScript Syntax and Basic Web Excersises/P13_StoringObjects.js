function  solution(arr) {

    let result;

    for (let input of arr) {
        let separate= input.split(' -> ');
        let name = separate[0];
        let age = separate[1];
        let ocenka= separate[2];

        result = {
            'Name': name,
            'Age': age,
            'Grade': ocenka
        };

        for (let item in result){
            console.log(item + ": "+ result[item]);
        }
    }




}

solution(['Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90',
]);