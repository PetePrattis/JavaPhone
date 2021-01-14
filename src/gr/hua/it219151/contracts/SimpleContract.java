package gr.hua.it219151.contracts;

import gr.hua.it219151.enums.ContractType;

//this is a simple contract
public class SimpleContract {
    private String contractID;
    private ContractType type;


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


}
