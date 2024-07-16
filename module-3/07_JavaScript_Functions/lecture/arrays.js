const daysOfTheWeek = ['Sun','Mon','Tues','Wens','Thurs','Fri','Sat'];

daysOfTheWeek.forEach((day, index, daysOfTheWeek) => {
    
    if(index == 0){
        console.table(daysOfTheWeek)
    }
    console.log(day + ' was found at index :' + index);
});


//FILTER

const daysThatStartWithT = daysOfTheWeek.filter((element) => {

    // check for condition for true or false, if true add element to the new array
    
    if (element.startsWith('T')){
        return true;
    }
    return false;

});
console.table(daysThatStartWithT);


const numbers = [2.50,3.50,9.99,12.76];
const sum = numbers.reduce((runningTotal, num) => {
return runningTotal += num;
},0);

console.log(sum);

const newDaysOfWeek = daysOfTheWeek.map((day) =>{



return "It is " + day + "day!";

});

console.log(newDaysOfWeek);

