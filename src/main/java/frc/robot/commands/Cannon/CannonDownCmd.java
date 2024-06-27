// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Cannon;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CannonSubsystem;

public class CannonDownCmd extends Command {
  /** Creates a new CannonDownCmd. */
  CannonSubsystem m_cannonSubsystem;
  public CannonDownCmd(CannonSubsystem cannonSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_cannonSubsystem = cannonSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_cannonSubsystem.cannonDown();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_cannonSubsystem.cannonStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
