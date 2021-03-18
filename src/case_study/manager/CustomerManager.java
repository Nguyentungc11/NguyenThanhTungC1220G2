package case_study.manager;

import case_study.commons.CompareNameAndBirthDay;
import case_study.commons.FuncWriteAndRead;
import case_study.commons.NameException;
import case_study.commons.Validation;
import case_study.models.Customer;
import case_study.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();
    FuncWriteAndRead funcWriteAndRead = new FuncWriteAndRead();

    public String inputName() throws NameException {
        do {
            System.out.println("Input name of customer: ");
            String name = scanner.nextLine();
            if (validation.validateName(name)) {
                return name;
            }
        } while (true);

    }

    public String inputBirthDay() {
        do {
            System.out.println("Input birthday: ");
            String birthday = scanner.nextLine();
            if (validation.checkBirthDay(birthday)){
                return birthday;
            }
        }while (true);

    }

    public String inputGender() {
        do {
            System.out.println("Input gender: ");
            String gender = scanner.nextLine();
            if (validation.checkGender(gender)){
                return gender;
            }
        }while (true);

    }

    public String inputIdCard() {
        do {
            System.out.println("Input id card: ");
            String idCard = scanner.nextLine();
            if (validation.checkIdCustomer(idCard)){
                return idCard;
            }
        }while (true);

    }

    public String inputPhoneNumber() {
        System.out.println("Input phone number: ");
        return scanner.nextLine();
    }

    public String inputEmail() {
        do {
            System.out.println("Input email: ");
            String email = scanner.nextLine();
            if (validation.checkEmail(email)) {
                return email;
            }
        } while (true);
    }

    public String inputTypeCustomer() {
        System.out.println("Input typeCustomer: ");
        return scanner.nextLine();
    }

    public String inputAddress() {
        System.out.println("Input address: ");
        return scanner.nextLine();
    }

    public void addCustomer() throws NameException {
        List<String> customerInfo = new ArrayList<>();
        String name = inputName();
        customerInfo.add(name);
        String birthday = inputBirthDay();
        customerInfo.add(birthday);
        String gender = inputGender();
        customerInfo.add(gender);
        String idCard = inputIdCard();
        customerInfo.add(idCard);
        String phoneNumber = inputPhoneNumber();
        customerInfo.add(phoneNumber);
        String email = inputEmail();
        customerInfo.add(email);
        String typeCustomer = inputTypeCustomer();
        customerInfo.add(typeCustomer);
        String address = inputAddress();
        customerInfo.add(address);
        Customer customer = new Customer(name, birthday, gender, idCard, phoneNumber, email, typeCustomer, address);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        funcWriteAndRead.write("Customer.csv", customerList, true);
    }

    public void showCustomer() {
        List<String[]> list = funcWriteAndRead.read("Customer.csv");
        List<Customer> customerList = new ArrayList<>();
        for (String[] customerInfo : list) {
            Customer customer = new Customer(customerInfo[0], customerInfo[1], customerInfo[2], customerInfo[3], customerInfo[4],
                    customerInfo[5], customerInfo[6], customerInfo[7]);
            customerList.add(customer);
        }
        customerList.sort(new CompareNameAndBirthDay());
        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }
    }
}

