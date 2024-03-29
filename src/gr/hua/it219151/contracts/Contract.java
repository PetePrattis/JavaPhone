package gr.hua.it219151.contracts;


//this is an extended contract with extra fields for mobile contract
public class Contract extends SimpleContract {
    private String contractID;
    private String type;
    private String phoneNumber;
    private String AFM;
    private String password;
    private int freeMinutes;
    private String startDate;
    private String contractDuration;
    private int monthlyCost;
    private boolean isEContract;
    private String paymentMethod;
    private String networkSpeed;
    private int freeMonthlyGB;
    private int freeMonthlySMS;

    //this is the constructor for a Contract object
    public Contract(String contractID, String type, String phoneNumber, String AFM, String password, int freeMinutes, String startDate, String contractDuration, int monthlyCost, boolean isEContract, String paymentMethod, String networkSpeed, int freeMonthlyGB, int freeMonthlySMS) {
        this.contractID = contractID;
        this.type = type;
        this.phoneNumber = phoneNumber;
        this.AFM = AFM;
        this.password = password;
        this.freeMinutes = freeMinutes;
        this.startDate = startDate;
        this.contractDuration = contractDuration;
        this.monthlyCost = monthlyCost;
        this.isEContract = isEContract;
        this.paymentMethod = paymentMethod;
        this.networkSpeed = networkSpeed;
        this.freeMonthlyGB = freeMonthlyGB;
        this.freeMonthlySMS = freeMonthlySMS;
    }

    //getters and setters for all fields

    //overrides the setters and getters of the SimpleContract class that Contract class extends from
    @Override
    public String getContractID() {
        return contractID;
    }

    @Override
    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAFM() {
        return AFM;
    }

    public void setAFM(String AFM) {
        this.AFM = AFM;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFreeMinutes() {
        return freeMinutes;
    }

    public void setFreeMinutes(int freeMinutes) {
        this.freeMinutes = freeMinutes;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(String contractDuration) {
        this.contractDuration = contractDuration;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(int monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public boolean isEContract() {
        return isEContract;
    }

    public void setEContract(boolean EContract) {
        isEContract = EContract;
    }

    public String getPaymentType() {
        return paymentMethod;
    }

    public void setPaymentType(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getNetworkSpeed() {
        return networkSpeed;
    }

    public void setNetworkSpeed(String networkSpeed) {
        this.networkSpeed = networkSpeed;
    }

    public int getFreeMonthlyGB() {
        return freeMonthlyGB;
    }

    public void setFreeMonthlyGB(int freeMonthlyGB) {
        this.freeMonthlyGB = freeMonthlyGB;
    }

    public int getFreeMonthlySMS() {
        return freeMonthlySMS;
    }

    public void setFreeMonthlySMS(int freeMonthlySMS) {
        this.freeMonthlySMS = freeMonthlySMS;
    }
}
