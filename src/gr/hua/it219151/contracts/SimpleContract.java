package gr.hua.it219151.contracts;

import gr.hua.it219151.enums.ContractDuration;
import gr.hua.it219151.enums.ContractType;
import gr.hua.it219151.enums.NetworkSpeed;
import gr.hua.it219151.enums.PaymentType;

//this is a simple landline contract
public class SimpleContract {
    private String contractID;
    private ContractType type;
    private String phoneNumber;
    private String AFM;
    private String password;
    private int freeMinutes;
    private String startDate;
    private ContractDuration contractDuration;
    private int monthlyCost;
    private boolean isEContract;
    private PaymentType paymentType;
    private NetworkSpeed networkSpeed;

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public ContractType getType() {
        return type;
    }

    public void setType(ContractType type) {
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

    public ContractDuration getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(ContractDuration contractDuration) {
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

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public NetworkSpeed getNetworkSpeed() {
        return networkSpeed;
    }

    public void setNetworkSpeed(NetworkSpeed networkSpeed) {
        this.networkSpeed = networkSpeed;
    }
}
