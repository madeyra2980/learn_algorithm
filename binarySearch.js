const arrays = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function binarySearch(arrays, item) {
    let start = 0;
    let end = arrays.length - 1;
    let middle;
    let position = -1;

    while (start <= end) {
        middle = Math.floor((start + end) / 2);

        if (arrays[middle] === item) {
            position = middle;
            return position;
        }

        if (item < arrays[middle]) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
    }

    return position; 
}

console.log(binarySearch(arrays, 3)); 
