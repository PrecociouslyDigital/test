/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Joystick.*;

public class RobotTemplate extends IterativeRobot {

    public double stickPut;
    public Joystick controller;
    public SpeedController motor1, motor2, motor3, motor4;
    double distance = 0;
    public void robotInit() {
        
        controller = new Joystick(1);
        motor1 = new Talon(1);
        motor2 = new Talon(2);
        motor3 = new Talon(3);
        motor4 = new Talon(4);
        stickPut = 0;
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        stickPut = controller.getAxis(AxisType.kX);
        distance++;
        if(distance <= 0){
            motor1.set(0.2);//back and forth between speeds, -1.0 to 1.0
        }else{
            motor1.set(0);
        }
                }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {

    }

    public void turn(double maxRate, double turn, SpeedController motorOne, SpeedController motorTwo) {
        if (turn >= 0) {
            boolean right = true;
        } else {
            boolean right = false;
        }

    }

}
