# Number Summation Application

## Overview
This Java application consists of two components: a **Server** and a **Client**. The Server listens for incoming connections on a specified port and processes requests from the Client. The Client sends two numbers to the Server, which then computes and returns their sum.

## Technologies Used
- Java (JDK 8 or higher)

## Files Included
- `Server.java`: The server-side application that accepts client connections and computes the sum of two numbers.
- `Client.java`: The client-side application that prompts the user for two numbers, sends them to the Server, and displays the result.

## How to Run the Application

### Prerequisites
Ensure you have the Java Development Kit (JDK) installed on your machine. You can download it from [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or [AdoptOpenJDK](https://adoptopenjdk.net/).

### Running the Server
1. Open a terminal and navigate to the directory containing the `Server.java` file.
2. Compile the Server code:
   ```bash
   javac Server.java
   ```
3. Start the Server:
   ```bash
   java Server
   ```
   The server will start and listen for incoming client connections on port **4523**.

### Running the Client
1. Open another terminal window and navigate to the directory containing the `Client.java` file.
2. Compile the Client code:
   ```bash
   javac Client.java
   ```
3. Start the Client:
   ```bash
   java Client
   ```
4. Follow the prompts to input the two numbers you wish to sum.

## Example Interaction
1. Start the Server.
2. Start the Client.
3. Input numbers when prompted:

   ```
   Donner le premier nombre: 10
   Donner le deuxieme nombre: 15
   La somme est: 25
   ```

## Code Explanation

### Server.java
- **Main Class**: Initializes a `ServerSocket` on port 4523, waits for a client connection, and processes incoming data.
- **Functionality**: Receives two numbers, computes their sum, and sends the result back to the Client.

### Client.java
- **Main Class**: Establishes a connection to the Server and prompts the user to enter two numbers.
- **Functionality**: Sends the numbers to the Server and receives the computed sum.

## Notes
- Ensure that the Server is running before starting the Client.
- The application currently runs locally; for remote usage, modify the IP address in the Client code.

## Author
Alaoui Belghiti Hanaa
