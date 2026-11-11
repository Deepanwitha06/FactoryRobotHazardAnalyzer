package com.factory.robot;

import com.factory.robot.auditor.RobotSafetyAuditor;
import com.factory.robot.exception.RobotSafetyException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RobotSafetyAuditor auditor = new RobotSafetyAuditor();

        try {
            System.out.print("Enter arm precision: ");
            double armPrecision = scanner.nextDouble();

            System.out.print("Enter worker density: ");
            int workerDensity = scanner.nextInt();

            System.out.print("Enter machinery state: ");
            String machineryState = scanner.next();

            double risk = auditor.calculateHazardRisk(
                    armPrecision, workerDensity, machineryState);

            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException exception) {
            System.out.println(exception.getMessage());

        } finally {
            scanner.close();
        }
    }
}