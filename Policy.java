/**
 * The {@code Policy} class represents an insurance policy with attributes like policy number,
 * provider name, personal details of the insured, and their health information. It provides methods
 * to set and get these attributes, calculate the insured's Body Mass Index (BMI), and calculate
 * the insurance price based on age, smoking status, and BMI.
 */

public class Policy {
    // Attributes
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; // "smoker" or "non-smoker"
    private int height; // in inches
    private int weight; // in pounds

    // No-arg constructors with default values
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }
    /**
     * Constructs a new Policy object with the specified details.
     *
     * @param policyNumber   the policy number
     * @param providerName   the name of the insurance provider
     * @param firstName      the first name of the insured
     * @param lastName       the last name of the insured
     * @param age            the age of the insured
     * @param smokingStatus  the smoking status of the insured, "smoker" or "non-smoker"
     * @param height         the height of the insured in inches
     * @param weight         the weight of the insured in pounds
     */
     
    // Constructor that accepts arguments
    public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, int height, int weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Setters and Getters
    
    /**
     * Sets the policy number.
     *
     * @param policyNumber the policy number to set
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
   /**
     * Returns the policy number.
     *
     * @return the policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }
    
   /**
     * Sets the provider name.
     *
     * @param providerName the provider name to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
   /**
     * Returns the Provider name.
     *
     * @return the policy number
     */
    public String getProviderName() {
        return providerName;
    }
   
   /**
     * Sets the first name.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   /**
     * Returns the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }
   
   /**
     * Sets the last name.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   
   /**
     * Returns the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }
   
   /**
     * Sets the age.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
   
   /**
     * Returns the age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }
   
   /**
     * Sets the smoking status.
     *
     * @param smokingStatus the smoking status name to set
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
   
   /**
     * Returns the smoking status.
     *
     * @return the smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }
   
   /**
     * Sets the height.
     *
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
   
   /**
     * Returns the height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }
   
   /**
     * Sets the weight.
     *
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
   
   /**
     * Returns the weight.
     *
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    // Method to calculate BMI
    /**
     * Calculates and returns the Body Mass Index (BMI) of the insured.
     *
     * @return the calculated BMI
     */
    public double calculateBMI() {
        return (this.weight * 703.0) / (this.height * this.height);
    }

    // Method to calculate insurance price
    /**
     * Calculates and returns the insurance price based on age, smoking status, and BMI.
     * Additional fees are applied for individuals over the age of 50, smokers, and those with a BMI over 35.
     *
     * @return the calculated insurance price
     */
    public double calculateInsurancePrice() {
        double baseFee = 600;
        if (this.age > 50) {
            baseFee += 75;
        }
        if (this.smokingStatus.equalsIgnoreCase("smoker")) {
            baseFee += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            baseFee += (bmi - 35) * 20;
        }
        return baseFee;
    }
}
