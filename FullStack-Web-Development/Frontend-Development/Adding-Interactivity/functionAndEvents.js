// Creating a JavaScript function
function greetUser() {
  alert("Hello, welcome to our website!");
}

// Parameters and return values
function addNumbers(a, b) {
  return a + b;
}

let sum = addNumbers(5, 10);
console.log(sum); // Output: 15 

// Adding interactivity: addEventListener() and querySelectorAll() methods
function multipleEvent() {
  // <!-- Select all elements with the class "alert-button" -->
  const buttons = document.querySelectorAll(".alert-button");
  // Loop through each button and add a click event listener
  buttons.forEach(button => {
    button.addEventListener("click", () => {
      alert("Button clicked!");
    });
  });
}

// Changing text content on hover
function changeText() {
  // Select all elements with the class "hover-text"
  const paragraphs = document.querySelectorAll(".hover-text");

  // Loop through each paragraph and add a hover (mouseover) event listener
  paragraphs.forEach(paragraph => {
    paragraph.addEventListener("mouseover", () => {
      paragraph.textContent = "You hovered over me!";
    });

    paragraph.addEventListener("mouseout", () => {
      paragraph.textContent = "Hover over me!";
    });
  });
}

// Form validation
function validateForm() {
  let email = document.getElementById("emailInput").value;
  if (email === "") {
      alert("Email cannot be empty!");
      return false; // Prevent form submission
  }
}

function convertToFahrenheit() {
  const celsius = document.getElementById("celsiusInput").value;
  if (celsius === "") {
    alert("Please enter a temperature in Celsius.");
    return;
  }
  let fahrenheit = (celsius * 9/5) + 32
  document.getElementById("result").innerHTML = "Temperature in Fahrenheit: " + fahrenheit;
}