import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Project_Triston_Miller {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokersCount = 0;
        int nonSmokersCount = 0;
        
        try {
            File policyFile = new File("PolicyInformation.txt");
            Scanner fileScanner = new Scanner(policyFile);
            
            while (fileScanner.hasNextLine()) {
                String policyNumber = fileScanner.nextLine().trim();
                String providerName = fileScanner.nextLine().trim();
                String firstName = fileScanner.nextLine().trim();
                String lastName = fileScanner.nextLine().trim();
                int age = Integer.parseInt(fileScanner.nextLine().trim());
                String smokingStatus = fileScanner.nextLine().trim();
                int height = Integer.parseInt(fileScanner.nextLine().trim());
                int weight = Integer.parseInt(fileScanner.nextLine().trim());
                
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
                
                // Update smokers and non-smokers counts
                if ("smoker".equalsIgnoreCase(smokingStatus)) {
                    smokersCount++;
                } else {
                    nonSmokersCount++;
                }
                
                if (fileScanner.hasNextLine()) {
                    // Skip any empty lines between records
                    fileScanner.nextLine();
                }
            }
            fileScanner.close();
            
            // Displaying policy information for each policy
            for (Policy policy : policies) {
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
                System.out.println(); // Adding a blank line for readability between policies
                
            }
             // Display the counts
            System.out.println("Number of Smokers: " + smokersCount);
            System.out.println("Number of Non-Smokers: " + nonSmokersCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the policy information file.");
            e.printStackTrace();
        }
    }
}
