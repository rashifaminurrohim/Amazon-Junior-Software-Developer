/** String Concatination
 * --Combining 2 or more strings into one-- 
 * * Using plus (+) operator
 * * template literals backtick (``) operator
 */
function stringConcat() {
  // Example: String Concatination
  let firstName = "Ashley";
  let lastName = "Root";

  let fullName = firstName + " " + lastName; // Using + operator
  let greeting = `Hello, ${firstName} ${lastName}!`; // Using template literals
  console.log(greeting);
}