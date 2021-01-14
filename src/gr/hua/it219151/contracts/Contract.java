package gr.hua.it219151.contracts;

import gr.hua.it219151.enums.ContractDuration;
import gr.hua.it219151.enums.ContractType;
import gr.hua.it219151.enums.NetworkSpeed;
import gr.hua.it219151.enums.PaymentType;

//this is an extended contract with extra fields for mobile contract
public class Contract extends SimpleContract {
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
    private int freeMonthlyGB;
    private int freeMonthlySMS;

    public Contract(String contractID, ContractType type, String phoneNumber, String AFM, String password, int freeMinutes, String startDate, ContractDuration contractDuration, int monthlyCost, boolean isEContract, PaymentType paymentType, NetworkSpeed networkSpeed, int freeMonthlyGB, int freeMonthlySMS) {
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
        this.paymentType = paymentType;
        this.networkSpeed = networkSpeed;
        this.freeMonthlyGB = freeMonthlyGB;
        this.freeMonthlySMS = freeMonthlySMS;
    }


    @Override
    public String getContractID() {
        return contractID;
    }

    @Override
    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public ContractType getType() {
        return type;
    }

    @Override
    public void setType(ContractType type) {
        this.type = type;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getAFM() {
        return AFM;
    }

    @Override
    public void setAFM(String AFM) {
        this.AFM = AFM;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getFreeMinutes() {
        return freeMinutes;
    }

    @Override
    public void setFreeMinutes(int freeMinutes) {
        this.freeMinutes = freeMinutes;
    }

    @Override
    public String getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public ContractDuration getContractDuration() {
        return contractDuration;
    }

    @Override
    public void setContractDuration(ContractDuration contractDuration) {
        this.contractDuration = contractDuration;
    }

    @Override
    public int getMonthlyCost() {
        return monthlyCost;
    }

    @Override
    public void setMonthlyCost(int monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    @Override
    public boolean isEContract() {
        return isEContract;
    }

    @Override
    public void setEContract(boolean EContract) {
        isEContract = EContract;
    }

    @Override
    public PaymentType getPaymentType() {
        return paymentType;
    }

    @Override
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public NetworkSpeed getNetworkSpeed() {
        return networkSpeed;
    }

    @Override
    public void setNetworkSpeed(NetworkSpeed networkSpeed) {
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
