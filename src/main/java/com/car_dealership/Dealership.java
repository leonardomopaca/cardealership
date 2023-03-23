package com.car_dealership;

import com.car_dealership.model.Customer;
import com.car_dealership.model.Employee;
import com.car_dealership.model.Vehicle;

public class Dealership {
    public static void main(String[] args) {
        System.out.println("\n First scenario\n");

        Customer customer = new Customer("John", "324 Spring Dr", 12000);
        Vehicle vehicle = new Vehicle("NA", "Honda", "Accord", 2020, 10000);
        Employee employee = new Employee("Doug", .05f);

        customer.purchaseCar(vehicle, employee, false);

        System.out.println("\n Second scenario\n");

        customer = new Customer("John", "324 Spring Dr", 9000);
        vehicle = new Vehicle("NA", "Honda", "Accord", 2020, 10000);
        employee = new Employee("Doug", .05f);

        customer.purchaseCar(vehicle, employee, true);

        System.out.println("\n Third scenario\n");

        customer = new Customer("John", "324 Spring Dr", 9000);
        vehicle = new Vehicle("NA", "Honda", "Accord", 2020, 10000);
        employee = new Employee("Doug", .05f);

        customer.purchaseCar(vehicle, employee, false);
    }
}
