/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import frc.robot.OI;
import team3606.XBoxController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around. it also provides controllers for shared use in subsystems
 */
public class RobotMap 
{
  
  //controllers
  public XBoxController controllerOne;
  public XBoxController controllerTwo;
  
  //motor for elevator
  public PWMVictorSPX Elevator;
  
  //connect to arduion for line reader
  RobotMap()
  {
    //SET CONTROLLER PORTS
    controllerOne = new XBoxController(0);
    controllerTwo = new XBoxController(1);
    
    //TODO set elevtor motor ports
    Elevator = new PWMVictorSPX(4);
    
  }
}
