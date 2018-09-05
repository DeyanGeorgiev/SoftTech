function threeIntegersSum(arr) {
    let nums = arr[0].split(' ').map(Number);



    if (nums[0] + nums[1] === nums[2]) {

        if (nums[0] > nums[1]){
            [nums[1], nums[0]]=[nums[0], nums[1]]
        }

        console.log(`${nums[0]} + ${nums[1]} = ${nums[2]}`)
    }
    else if (nums[2] + nums[1] === nums[0]) {
        if (nums[2] > nums[1]){
            [nums[1], nums[2]]=[nums[2], nums[1]]
        }
        console.log(`${nums[2]} + ${nums[1]} = ${nums[0]}`)
    }
    else if (nums[0] + nums[2] === nums[1]) {

        if (nums[0] > nums[2]){
            [nums[2], nums[0]]=[nums[0], nums[2]]
        }
        console.log(`${nums[0]} + ${nums[2]} = ${nums[1]}`)
    }
    else {
        console.log("No");
    }


}

threeIntegersSum(['8 15 7']);