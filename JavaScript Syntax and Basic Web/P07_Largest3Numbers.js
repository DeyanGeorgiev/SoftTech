function largestNums(arr) {

    let nums = arr.map(Number).sort((a, b) => b - a);

    let count = Math.min(3, nums.length);

    for (let i = 0; i < count; i++) {
        console.log(nums[i]);
    }


}

largestNums([10, 5, 20, 3, 20]);