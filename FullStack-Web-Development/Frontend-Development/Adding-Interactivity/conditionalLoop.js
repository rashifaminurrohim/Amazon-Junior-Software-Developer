let marks = [85, 75, 90, 80, 95];
let total = 0;
let average;
let grade;

// Calculate the total marks using a for loop
for(let i = 0; i < marks.length; i++) {
  total += marks[i]; 
}

average = total/marks.length; // Calculate the average marks

// Determine the grade using conditional statements
if (average >= 90) {
  grade = "A";
} else if (average >= 80) {
  grade = "B";
} else if (average >= 70) {
  grade = "C";
} else {
  grade = "F";
}

console.log("Average Marks: " + average);
console.log("Grade: " + grade);