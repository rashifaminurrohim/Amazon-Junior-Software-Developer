// Creating and accessing an object
let person = {
  name: "Alice",
  age: 30,
  email: "alice@example.com"
}
// You can then retrieve or modify an object’s properties using dot notation or bracket notation.
// retrieve with dot notation
console.log(person.name); // Output Alice
// retrieve with bracket notation
console.log(person["email"]); // Output: alice@example.com

// Editing objective properties
// you can modify its properties, add new ones, or delete existing properties to keep it up-to-date.

// Modifying: You can change the value of an existing property by reassigning it.
person.age = 31;
console.log(person.age);

// Adding: You can add a new property to an object by assigning it a value.
person.country = "USA";
console.log(person); // Output: {name: "Alice", age: 31, email: "alice@example.com", country: "USA"}

// Deleting: To remove a property from an object, use the delete keyword.
delete person.email;
console.log(person); // Output: {name: "Alice", age: 31, country: "USA"}

// Common object methods

// Object.keys(obj): Returns an array of keys in the object
console.log(Object.keys(person)); // Output: ["name", "age", "country"]

// Object.values(obj): Returns an array of values in the object
console.log(Object.values(person)); // Output: ["Alice", 31, "USA"]

// Object.entries(obj): Returns an array of key-value pairs
console.log(Object.entries(person)); // Output: [["name", "Alice"], ["age", 31], ["country", "USA"]]

// Example
let book = {
  title: "JavaScript Basics",
  author: "John Doe",
  year: 2021
};
// Adding a new property
book.publisher = "Tech Books Publishing";
// Modifying an existing property
book.year = 2022;
// Deleting a property
delete book.author;
console.log(book);
// Output: {title: "JavaScript Basics", year: 2022, publisher: "Tech Books Publishing"}

// Challenge: Managing student grades with arrays and objects
// Array of student objects
let students = [
  { name: "Alice", grades: [85, 90, 78] },
  { name: "Bob", grades: [70, 75, 80] },
  { name: "Charlie", grades: [95, 88, 92] }
];
// Function to calculate average grade
function calculateAverage(grades) {
  //TODO: Write your code here
  let total = 0;
  for (let i = 0; i < grades.length; i++) {
    total += grades[i];
  }
  return total / grades.length;
}
// Display each student’s name, grades, and average grade
students.forEach(function (student) {
  //TODO: Write your code here
  console.log("Name: ", student.name);
  console.log("Grades: ", student.grades);
  console.log("Average Grades", calculateAverage(student.grades))
  console.log("---------------------");
});

/** Solution for the challenges
 * // Array of student objects
let students = [
  { name: "Alice", grades: [85, 90, 78] },
  { name: "Bob", grades: [70, 75, 80] },
  { name: "Charlie", grades: [95, 88, 92] }
];

// Function to calculate average grade
function calculateAverage(grades) {
  let total = 0;
  grades.forEach(function(grade) {
    total += grade;
  });
  return total / grades.length;
}

// Display each student’s name, grades, and average grade
students.forEach(function(student) {
  let average = calculateAverage(student.grades);
  console.log(`Student: ${student.name}`);
  console.log(`Grades: ${student.grades.join(", ")}`);
  console.log(`Average Grade: ${average.toFixed(2)}`);
  console.log("---------------------");
});
 */


