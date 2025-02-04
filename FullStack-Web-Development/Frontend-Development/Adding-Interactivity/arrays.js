// Creating and accessing an array

// Using square brackets
let fruits = ["Apple", "Banana", "Mango"];

// Using the new Array() constructor
let numbers = new Array(1,2,3,4,5);

// access an element in an array
console.log(fruits[1]);

// Common array methods
// 1. push() adds new element to the end 
fruits.push("Orange");
console.log(fruits);
// 2. pop() removes last element of the array
fruits.pop();
console.log(fruits);
// 3. shift() removes the first element of the array
fruits.shift();
console.log(fruits);
// 4. unshift() adds new element to the beginning of the array
fruits.unshift("Kiwi");
console.log(fruits);
// 5. length return the number of elements in the array
console.log(fruits.length);
// 6. forEach() executes a function for each element in the array
fruits.forEach(function(fruit){
  console.log(fruit);
});

// Example
let cars = ["Toyoti", "Hondi", "Fird"];
cars.push("Chevrolet");
cars.shift();
console.log(cars);