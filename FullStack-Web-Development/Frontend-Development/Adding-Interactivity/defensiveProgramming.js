function validateUserForm(userData) {
  try {

    if (typeof userData.name !== "string" || userData.name.trim() === "") {
      throw new Error("Invalid name. Name cannot be empty.");
    }

    // TODO: Validate age (must be a positive integer)
    if (!userData.age || userData.age <= 0) {
      throw new Error("Age must be a positive integer");
    }

    // TODO: Validate email (Check if it contains @ in email id)
    if (!(userData.email.includes("@"))) {
      throw new Error("Please input a valid email.");
    }
    // TODO: Log success message if all validations pass
    console.log("User form is valid:", userData);
  } catch (error) {
    // TODO: Handle validation errors by logging the error message
    console.log(error.message);
  } finally {
    // TODO: Finalize by logging a completion message
    console.log("clean up space");
  }
}
// Example test cases
validateUserForm({ name: "Alice", age: 25, email: "alice@example.com" }); // Should pass
validateUserForm({ name: "", age: 25, email: "alice@example.com" });  // Should fail (invalid name)
validateUserForm({ name: "Alice", age: -1, email: "alice@example.com" });// Should fail (invalid age)
validateUserForm({ name: "Alice", age: 25, email: "alice.com" }); // Should fail (invalid email)



