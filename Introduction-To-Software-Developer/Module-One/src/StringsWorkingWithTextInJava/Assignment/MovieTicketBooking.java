package StringsWorkingWithTextInJava.Assignment;

public class MovieTicketBooking {
    public static void main(String[] args) {
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int numberOfTickets = 8;
        double pricePerTicket = 10.57;

        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        double totalPrice = numberOfTickets * pricePerTicket;

        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        // first and last name and convert them to lower case
        String userName = (firstName + lastName).toLowerCase();

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieName = movieTitle.toUpperCase();

        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: "+ userName);
        System.out.println("Movie: "+ movieName);
        System.out.println("Number of Tickets: "+ numberOfTickets);
        System.out.println("Price per ticket: $"+ pricePerTicket);
        System.out.println("Total Price of " + numberOfTickets + " tickets: $" + totalPrice +"\n");
        System.out.println("Thank you for choosing us for booking your movie tickets \nEnjoy your movie!!! ");
    }
}
