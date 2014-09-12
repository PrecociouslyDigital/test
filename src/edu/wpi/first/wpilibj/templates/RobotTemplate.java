/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class RobotTemplate extends IterativeRobot {
    
    public double stickPut;
    public Joystick controller;
    public SpeedController motor;
    
    public void robotInit() {
        controller = new Joystick(1);
        motor = new Talon(1);
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
        //hey! Comment!
        stickPut = controller.getAxis(AxisType.kX);
        motor.set(stickPut);//back and forth between speeds, -1.0 to 1.0
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        
    }
    
}
