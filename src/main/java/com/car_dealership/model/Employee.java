package com.car_dealership.model;

public class Employee {
    private String name;
    private float comission;

    public Employee(String name, float comission) {
        this.name = name;
        this.comission = comission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getComission() {
        return comission;
    }

    public void setComission(float comission) {
        this.comission = comission;
    }

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){
        if(finance == true){
            double loanAmount = vehicle.getValue() - customer.getCashOnHand();
            if(runCreditHistory(customer, loanAmount))
                processTransaction(customer, vehicle);
            else
                purchaseNotCompleted(vehicle);
        } else if (vehicle.getValue() <= customer.getCashOnHand()) {
            processTransaction(customer, vehicle);
        }else {
            purchaseNotCompleted(vehicle);
        }

    }

    private void purchaseNotCompleted(Vehicle vehicle) {
        System.out.println("Client needs some cash for buying the " + vehicle.toString());
    }

    private void processTransaction(Customer customer, Vehicle vehicle) {
        System.out.println("Customer "+customer.getName()+" has purchase the vehicle: "
        + vehicle.toString() + " for the price $" + String.format("%.2f", vehicle.getValue())
        + "\n Congratulations, " + this.getName()
        + " YOUR COMMISSION IS: $" + String.format("%.2f", vehicle.getValue() * this.comission) );
    }

    private boolean runCreditHistory(Customer customer, double value) {
        System.out.println("Credit of $"+ String.format("%.2f",value) +" approved for the customer " + customer.getName());
        return true;
//        System.out.println("Credit of "+value+" NOT approved for the customer " + customer.getName());
//        return false;
    }
}
