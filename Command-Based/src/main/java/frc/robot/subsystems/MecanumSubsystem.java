/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
//import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
//import frc.robot.OI;
import team3606.XBoxController;

/**
 * Subsystem for the mecanum drive system. Call drive functions from related commands
 */
public class MecanumSubsystem extends Subsystem 
{

  private static final int kFrontLeftChannel = 2;
  private static final int kRearLeftChannel = 3;
  private static final int kFrontRightChannel = 1;
  private static final int kRearRightChannel = 0;

  private MecanumDrive mecanumDrive;

  public void initDriveComponents()
  {
    PWMVictorSPX frontLeft = new PWMVictorSPX(kFrontLeftChannel);
    PWMVictorSPX rearLeft = new PWMVictorSPX(kRearLeftChannel);
    PWMVictorSPX frontRight = new PWMVictorSPX(kFrontRightChannel);
    PWMVictorSPX rearRight = new PWMVictorSPX(kRearRightChannel);

    // Invert the left side motors.
    // You may need to change or remove this to match your robot.
    frontLeft.setInverted(true);
    rearLeft.setInverted(true);

    mecanumDrive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);
  }

  //Hardcoded to use the joypad that will be defined in OI. Maybe pass instead?
  public void drive(XBoxController controller)
  {
    mecanumDrive.driveCartesian(controller.LeftXAxis(), controller.LeftYAxis(), controller.RightXAxis(), 0.0);
  }

  @Override
  public void initDefaultCommand() 
  {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}