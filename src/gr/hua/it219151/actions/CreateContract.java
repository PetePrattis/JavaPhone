package gr.hua.it219151.actions;

import gr.hua.it219151.Main;
import gr.hua.it219151.contracts.SimpleContract;
import gr.hua.it219151.contracts.Contract;
import gr.hua.it219151.enums.ContractDuration;
import gr.hua.it219151.enums.ContractType;
import gr.hua.it219151.enums.NetworkSpeed;
import gr.hua.it219151.enums.PaymentType;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.List;

public class CreateContract {

    //the list of all contracts
    public static List<Contract> savedContracts = new ArrayList<>();

    public void insertContract(User loggedUser){
        System.out.println("Welcome to Insert Contract Page!");

        Main m = new Main();
        savedContracts = m.allContracts;


        Contract newContract = new Contract("", ContractType.MOBILE, "", "", "", 0, "2021-1-14", ContractDuration.ONEYEAR, 15,true, PaymentType.CREDIT, NetworkSpeed.DATA,0,0);
        SimpleContract newContract1 = new Contract("", ContractType.MOBILE, "", "", "", 0, "2021-1-14", ContractDuration.ONEYEAR, 15,true, PaymentType.CREDIT, NetworkSpeed.DATA,0,0);

        m.allContracts.add(newContract);

        for(Contract contract: m.allContracts){
            System.out.println(contract);
        }
    }
}
