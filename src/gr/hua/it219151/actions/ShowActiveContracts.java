package gr.hua.it219151.actions;

import gr.hua.it219151.Main;
import gr.hua.it219151.contracts.Contract;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ShowActiveContracts {

    //the list of all contracts
    public static List<Contract> savedContracts = new ArrayList<>();

    public void printContracts(User loggedUser){
        Main m = new Main();
        savedContracts = m.allContracts;

        List<Contract> userContracts = new ArrayList<>();
        for(Contract contract: savedContracts){
            if(contract.getAFM().equals(loggedUser.getAFM())){// todo check for non zero usage values
                userContracts.add(contract);
            }
        }

        if(userContracts.isEmpty()){
            System.out.println("You don't have any contracts!");
        }
        else{
            int counter = 0;
            System.out.println("Your Active Contracts:");
            for(Contract contract: userContracts){
                System.out.println(counter+". Id: " + contract.getContractID() + " Contract Type: " + contract.getType() + " Phone Number " + contract.getPhoneNumber());//todo show all info
                counter++;
            }

        }

    }

}
