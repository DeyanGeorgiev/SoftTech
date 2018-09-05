function solution(text) {


    for (let i = 0; i < text.length; i++) {

        let input = JSON.parse(text[i]);

        let result = {

            Name: input.name,
            Age: input.age,
            Date: input.date,

        }

        for (let item in result) {
            console.log(item + ": " + result[item]);
        }

    }


}

solution(['{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}',
    '{"name":"Maria","age":24,"date":"31/12/1996"}']);