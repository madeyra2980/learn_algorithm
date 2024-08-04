//Алгоритм линейного поиска 
const arrays = [1,2,3,4,5,6,7,8,9]


function linearSearch(arrays, item){

    for (let i = 0; i < arrays.length; i++) {
        if(arrays[i] === item){
            return i
        }
    }
}

console.log(linearSearch(arrays, 4))