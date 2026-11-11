package com.factory.robot;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter arm precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter worker density: ");
        int workerDensity = scanner.nextInt();

        System.out.print("Enter machinery state: ");
        String machineryState = scanner.next();

        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);

        scanner.close();
    }
}