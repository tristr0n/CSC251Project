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

    // No-arg constructor
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
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return (this.weight * 703.0) / (this.height * this.height);
    }

    // Method to calculate insurance price
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
