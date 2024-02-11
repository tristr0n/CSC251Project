import java.util.Scanner;

public class Project_Triston_Miller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting information from the user
        System.out.println("Enter Policy Number:");
        String policyNumber = scanner.nextLine();

        System.out.println("Enter Provider Name:");
        String providerName = scanner.nextLine();

        System.out.println("Enter Policyholder's First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Policyholder's Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Policyholder's Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        System.out.println("Enter Policyholder's Smoking Status (smoker/non-smoker):");
        String smokingStatus = scanner.nextLine();

        System.out.println("Enter Policyholder's Height (in inches):");
        int height = scanner.nextInt();

        System.out.println("Enter Policyholder's Weight (in pounds):");
        int weight = scanner.nextInt();

        // Creating an instance of Policy class
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Displaying policy information
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
        System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.calculateBMI()));
        System.out.println("Insurance Price: $" + String.format("%.2f", policy.calculateInsurancePrice()));
    }
}
