function fetchUserData() {
  try {
      // Simulate an API request with a 50% chance of failure
      let success = Math.random() > 0.5;
      
      // Simulate asynchronous operation using a timeout
      setTimeout(() => {
          if (!success) {
              throw new Error("Failed to fetch user data. Network error.");
          } else {
              console.log("User data fetched successfully.");
          }
      }, 1000);
      
  } catch (error) {
      // Catch the error and display an error message
      console.log("Error:", error.message);
  } finally {
      // Always executed whether there is an error or not
      console.log("Fetch user data operation complete.");
  }
}

// Call the function
fetchUserData();