/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
//NOT USED JUSTED KEPT INCASE WE NEED IT
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Main drive command. Basically just a shell to follow Subsystem/Command structure
 */
public class Drive extends Command 
{
  public Drive() 
  {
    // Use requires() here to declare subsystem dependencies
    //requires(Robot.mecanumSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() 
  {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() 
  {
    //Robot.mecanumSubsystem.drive(Robot.operatorInterface.driverController);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() 
  {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() 
  {

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() 
  {
    
  }
}
