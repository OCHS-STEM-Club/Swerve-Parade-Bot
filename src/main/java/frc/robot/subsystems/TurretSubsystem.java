// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TurretConstants;

public class TurretSubsystem extends SubsystemBase {
  /** Creates a new Turret. */
  private TalonFX turretMotor;

    public TurretSubsystem() {
        turretMotor = new TalonFX(TurretConstants.turretMotorID);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void turretLeft() {
    turretMotor.set(TurretConstants.turretSpeed);
  }

  public void turretRight() {
    turretMotor.set(TurretConstants.turretSpeed);
  }

  public void turretStop() {
    turretMotor.set(TurretConstants.turretStop);
  }

  public void turretSpeed(double speed) {
    turretMotor.set(speed);
  }
}
