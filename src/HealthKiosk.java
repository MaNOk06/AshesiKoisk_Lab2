import java.util.Scanner;
import java.util.Random;

public class HealthKiosk {
    public static void main(String[] args){
        // Initialising variables
        String ID = "";
        String visitorName;
        String lastTwo;
        String finalFormat = "";
        String serviceName;

        // Strings are immutable but StringBuilder is mutable
        StringBuilder randomNumbers;

        Random rand = new Random();

        char visitorInput;
        char randUpper;
        char base;
        char shiftedLetter;

        int userInput;
        int tablets;
        int randNumbers;

        double sine, cosine;
        double bmi, BMI;

        // In mg
        double requiredDosage;
        final double TABLET_SIZE = 250;

        // In kg
        double weight;

        // In meters
        double height;

        // In degrees
        double angle;

        // Printing a simple welcome message
        System.out.println("Welcome to the Ashesi Health Kiosk :)");
        serviceName = "UNKNOWN";

        // Service Router
        Scanner input = new Scanner(System.in);

        // Used .print - I want the cursor and the prompt to be on the same line in the console
        System.out.print("Enter service code(P/L/T/C): ");
        visitorInput = input.nextLine().toUpperCase().trim().charAt(0);

        switch (visitorInput){
            // Used the double quotes because I declared "visitorInput" as a string
            case 'P':
                System.out.println("Go to Pharmacy Desk!");
                serviceName = "PHARMACY";
                break;
            case 'L':
                System.out.println("Go to Lab Desk!");
                serviceName = "LAB";
                break;
            case 'T':
                System.out.println("Go to Triage Desk!");
                serviceName = "TRIAGE";

                // Metric System
                System.out.println("======= Health Metric ======");
                System.out.println("1. BMI");
                System.out.println("2. Dosage Round-up");
                System.out.println("3. Simple Trig Helper");

                System.out.print("Enter an option(1,2,3): ");
                userInput = input.nextInt();
                input.nextLine();

                if (userInput == 1){
                    System.out.print("Enter your weight: ");
                    weight = input.nextDouble();

                    System.out.print("Enter your height: ");
                    height = input.nextDouble();
                    input.nextLine();

                    bmi = weight / (Math.pow(height,2));

                    // Rounded to 1 decimal place
                    BMI = Math.round(bmi * 10) / 10.0;

                    if (BMI < 18.5){
                        System.out.println("BMI: "+ BMI + " Category: Underweight");
                    }else if (BMI >= 18.5 && BMI <= 24.9){
                        System.out.println("BMI: "+ BMI + " Category: Normal");
                    }else if (BMI >= 25.0 && BMI <= 29.9){
                        System.out.println("BMI: "+ BMI + " Category: Overweight");
                    }else if (BMI >= 30){
                        System.out.println("BMI: "+ BMI + " Category: Obese");
                    }
                    System.out.println("Your BMI is " + BMI);

                    // This method makes use of ASCII and Unicode: The int adds up to the Unicode to produce the next letter
                    randUpper = (char) ('A' + rand.nextInt(26));

                    // Converting the generated numbers to string
                    randomNumbers = new StringBuilder();

                    for (int i = 0; i < 4; i++){
                        // 7 was used because the quantity of numbers between 3 and 9 is 7
                        randNumbers = 3 + rand.nextInt(7);

                        // Appending each round of numbers
                        randomNumbers.append(randNumbers);
                    }

                    // toString converts it from StrongBuilder format to a proper String
                    ID = randUpper + randomNumbers.toString();
                    System.out.println("Your ID is " + ID);

                    if (ID.length() != 5){
                        System.out.println("Invalid length");
                    }

                    // Accept user's name
                    System.out.print("Enter your name: ");
                    visitorName = input.nextLine();

                    base = visitorName.toUpperCase().charAt(0);
                    shiftedLetter = (char) ('A' + (base - 'A' + 2) % 26);

                    // Using a ternary operator instead of an if/else
                    lastTwo = ID.length() >= 2 ? ID.substring(ID.length() - 2) : "XX";

                    finalFormat = shiftedLetter + lastTwo + "-" + (int) Math.round(BMI);
                    System.out.println("Your code is " + finalFormat);
                }
                else if (userInput == 2){
                    System.out.print("Enter your required dosage(mg):  ");
                    requiredDosage = input.nextDouble();
                    input.nextLine();

                    tablets = (int) Math.ceil(requiredDosage / TABLET_SIZE);
                    System.out.println("You will get " + tablets + " tablets.");

                    // This method makes use of ASCII and Unicode: The int adds up to the Unicode to produce the next letter
                    randUpper = (char) ('A' + rand.nextInt(26));

                    // Converting the generated numbers to string
                    randomNumbers = new StringBuilder();

                    for (int i = 0; i < 4; i++){
                        // 7 was used because the quantity of numbers between 3 and 9 is 7
                        randNumbers = 3 + rand.nextInt(7);

                        // Appending each round of numbers
                        randomNumbers.append(randNumbers);
                    }

                    // toString converts it from StrongBuilder format to a proper String
                    ID = randUpper + randomNumbers.toString();
                    System.out.println("Your ID is " + ID);

                    if (ID.length() != 5){
                        System.out.println("Invalid length");
                    }

                    // Accept user's name
                    System.out.print("Enter your name: ");
                    visitorName = input.nextLine();

                    base = visitorName.toUpperCase().charAt(0);
                    shiftedLetter = (char) ('A' + (base - 'A' + 2) % 26);

                    // Using a ternary operator instead of an if/else
                    lastTwo = ID.length() >= 2 ? ID.substring(ID.length() - 2) : "XX";

                    finalFormat = shiftedLetter + lastTwo + "-" + tablets;
                    System.out.println("Your code is " + finalFormat);
                }
                else if (userInput == 3){
                    System.out.print("Enter an angle(in degrees): ");
                    angle = input.nextDouble();
                    input.nextLine();

                    sine = Math.round(Math.sin(Math.toRadians(angle)) * 1000) / 1000.0;
                    cosine = Math.round(Math.cos(Math.toRadians(angle)) * 1000) / 1000.0;

                    System.out.println("Sine of angle: " + sine + "°" + " Cosine of angle: " + cosine + "°");

                    // This method makes use of ASCII and Unicode: The int adds up to the Unicode to produce the next letter
                    randUpper = (char) ('A' + rand.nextInt(26));

                    // Converting the generated numbers to string
                    randomNumbers = new StringBuilder();

                    for (int i = 0; i < 4; i++){
                        // 7 was used because the quantity of numbers between 3 and 9 is 7
                        randNumbers = 3 + rand.nextInt(7);

                        // Appending each round of numbers
                        randomNumbers.append(randNumbers);
                    }

                    // toString converts it from StrongBuilder format to a proper String
                    ID = randUpper + randomNumbers.toString();
                    System.out.println("Your ID is " + ID);

                    if (ID.length() != 5){
                        System.out.println("Invalid length");
                    }

                    // Accept user's name
                    System.out.print("Enter your name: ");
                    visitorName = input.nextLine();

                    base = visitorName.toUpperCase().charAt(0);
                    shiftedLetter = (char) ('A' + (base - 'A' + 2) % 26);

                    // Using a ternary operator instead of an if/else
                    lastTwo = ID.length() >= 2 ? ID.substring(ID.length() - 2) : "XX";

                    finalFormat = shiftedLetter + lastTwo + "-" + (int) Math.round(sine * 100);
                    System.out.println("Your code is " + finalFormat);
                }
                else{
                    System.out.println("Invalid Input!");
                }
                break;
            case 'C':
                System.out.println("Go to " + visitorInput + "ounselling Desk!");
                serviceName = "COUNSELLING";
                break;
            default:
                System.out.println("Invalid Service Code!");
        }

        // Generating an ID for the other switch cases
        if (visitorInput != 'T'){
            // This method makes use of ASCII and Unicode: The int adds up to the Unicode to produce the next letter
            randUpper = (char) ('A' + rand.nextInt(26));

            // Converting the generated numbers to string
            randomNumbers = new StringBuilder();

            for (int i = 0; i < 4; i++){
                // 7 was used because the quantity of numbers between 3 and 9 is 7
                randNumbers = 3 + rand.nextInt(7);

                // Appending each round of numbers
                randomNumbers.append(randNumbers);
            }

            // toString converts it from StrongBuilder format to a proper String
            ID = randUpper + randomNumbers.toString();
            System.out.println("Your ID is " + ID);

            if (ID.length() != 5){
                System.out.println("Invalid length");
            }

            // Accept user's name
            System.out.print("Enter your name: ");
            visitorName = input.nextLine();

            base = visitorName.toUpperCase().charAt(0);
            shiftedLetter = (char) ('A' + (base - 'A' + 2) % 26);

            // Using a ternary operator instead of an if/else
            lastTwo = ID.length() >= 2 ? ID.substring(ID.length() - 2) : "XX";

            finalFormat = shiftedLetter + lastTwo + "-" + 0;
            System.out.println("Your code is " + finalFormat);
        }

        System.out.println("========== SUMMARY ==========");
        switch (serviceName) {
            case "PHARMACY":
            case "TRIAGE":
            case "LAB":
            case "COUNSELLING":
                System.out.print("Enter you name: ");
                visitorName = input.nextLine();
                System.out.println("Summary for " + visitorName + "Service: " + serviceName + " | ID: " + ID + " | Code: " + finalFormat);
                break;
            default:
                System.out.println("Summary: " + serviceName + " | ID: " + ID + " | Code: " + finalFormat);
        }
    }
}