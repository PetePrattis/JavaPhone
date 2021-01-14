package gr.hua.it219151.actions;

import gr.hua.it219151.Main;
import gr.hua.it219151.contracts.Contract;
import gr.hua.it219151.enums.*;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateContract {

    //the list of all contracts
    public static List<Contract> savedContracts = new ArrayList<>();

    public void insertContract(User loggedUser){
        System.out.println("Welcome to Insert Contract Page!");

        Main m = new Main();
        savedContracts = m.allContracts;

        Scanner scanner = new Scanner(System.in); //reads user's input
        String userTypeInput = "";

        //todo generate contract id
        String ID = "id_123456789";

        System.out.println("Pick Contract Type, 'a' for Landline and 'b' for Mobile:");
        userTypeInput = scanner.nextLine();
        while (!userTypeInput.equals("a") && !userTypeInput.equals("b")){ // check for valid user input
            System.out.println("This is not a valid option, pick again!");
            userTypeInput = scanner.nextLine();
        }
        ContractType contractType;
        if(userTypeInput.equals("a")){
            contractType = ContractType.LANDLINE;
        }
        else {
            contractType = ContractType.MOBILE;
        }

        System.out.println("Give phone Number:");
        String phonenumber = scanner.nextLine();
        while (true){ // check for valid phone number for given contract type
            if(contractType == ContractType.LANDLINE && phonenumber.charAt(0) == '2'){//todo check for valid phone length
                break;
            }
            else if(contractType == ContractType.MOBILE && phonenumber.charAt(0) == '6'){
                break;
            }
            System.out.println("Phone number type doesn't match contract Type! Give again:");
            phonenumber = scanner.nextLine();

        }

        String afm = loggedUser.getAFM();

        String password = loggedUser.getPassword();

        int freeminutes = 0;

        System.out.println("Give Date for contract activation:");
        String startdate = scanner.nextLine(); //todo check to be later than today?

        System.out.println("Pick Contract Duration, 'a' for One Year and 'b' for Two Years:");
        userTypeInput = scanner.nextLine();
        while (!userTypeInput.equals("a") && !userTypeInput.equals("b")){ // check for valid user input
            System.out.println("This is not a valid option, pick again!");
            userTypeInput = scanner.nextLine();
        }
        ContractDuration contractDuration;
        if(userTypeInput.equals("a")){
            contractDuration = ContractDuration.ONEYEAR;
        }
        else {
            contractDuration = ContractDuration.TWOYEARS;
        }

        int monthlyCost = 15;

        boolean isEContract = true;

        System.out.println("Pick Payment Method, 'a' for Credit, 'b' for Cash and 'c' for Debit:");
        userTypeInput = scanner.nextLine();
        while (!userTypeInput.equals("a") && !userTypeInput.equals("b") && !userTypeInput.equals("c")){ // check for valid user input
            System.out.println("This is not a valid option, pick again!");
            userTypeInput = scanner.nextLine();
        }
        PaymentMethod paymentMethod;
        if(userTypeInput.equals("a")){
            paymentMethod = PaymentMethod.CREDIT;
        }
        else if(userTypeInput.equals("b")){
            paymentMethod = PaymentMethod.CASH;
        }
        else {
            paymentMethod = PaymentMethod.DEBIT;
        }

        NetworkSpeed networkSpeed;
        if(contractType == ContractType.LANDLINE){
            System.out.println("Pick Network Speed, 'a' for ADSL, 'b' for VDSL or if you don't want internet pick 'c':");
            userTypeInput = scanner.nextLine();
            while (!userTypeInput.equals("a") && !userTypeInput.equals("b") && !userTypeInput.equals("c")){ // check for valid user input
                System.out.println("This is not a valid option, pick again!");
                userTypeInput = scanner.nextLine();
            }

            if(userTypeInput.equals("a")){
                networkSpeed = NetworkSpeed.ADSL;
            }
            else if(userTypeInput.equals("b")){
                networkSpeed = NetworkSpeed.VDSL;
            }
            else {
                networkSpeed = NetworkSpeed.NOINTERNET;
            }
        }
        else{
            networkSpeed = NetworkSpeed.DATA;
        }

        int freeMonthlyGB;
        int freeMonthlySMS;
        if(contractType == ContractType.MOBILE){
            freeMonthlyGB = 1000;
            freeMonthlySMS = 1000;
        }
        else{
            freeMonthlyGB = 0;
            freeMonthlySMS = 0;
        }


        Contract newContract = new Contract(ID, ContractType.MOBILE, phonenumber, afm, password, freeminutes, startdate, contractDuration, monthlyCost,isEContract, paymentMethod, networkSpeed,freeMonthlyGB,freeMonthlyGB);

        m.allContracts.add(newContract);

    }
}
