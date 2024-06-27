// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Siren;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CannonSubsystem;

public class SirenOnCmd extends Command {
  /** Creates a new CannonUpCmd. */
  CannonSubsystem m_cannonSubsystem;
  public SirenOnCmd(CannonSubsystem cannonSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_cannonSubsystem = cannonSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_cannonSubsystem.sirenOn();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_cannonSubsystem.sirenOff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
