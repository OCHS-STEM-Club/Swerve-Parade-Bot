// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SirenConstants;
import frc.robot.Constants.CanonConstants;
import frc.robot.Constants.ShooterConstants;

public class CannonSubsystem extends SubsystemBase {
  /** Creates a new cannonSubsystem. */
  private WPI_TalonSRX shooterSolenoid;

  private AnalogInput pressureSensor;

  private CANSparkMax cannonMotor;

  private WPI_TalonSRX sirenMotor;

  public CannonSubsystem() {
    shooterSolenoid = new WPI_TalonSRX(ShooterConstants.shooterSolenoidID);

    pressureSensor = new AnalogInput(ShooterConstants.pressureSensorPort);

    cannonMotor = new CANSparkMax(CanonConstants.canonMotorID, MotorType.kBrushless);

    sirenMotor = new WPI_TalonSRX(SirenConstants.sirenMotorID);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shooterOpen() {
    shooterSolenoid.setVoltage(ShooterConstants.shooterSolenoidOpenVoltage);
  }

  public void shooterClose() {
    shooterSolenoid.setVoltage(ShooterConstants.shooterSolenoidClosedVoltage);
  }

  public double getPressureSensor() { 
    return pressureSensor.getAccumulatorValue();
  }

  public void cannonUp() {
    cannonMotor.set(CanonConstants.canonSpeed);
  }

  public void cannonDown() {
    cannonMotor.set(-CanonConstants.canonSpeed);
  }

  public void cannonStop() {
    cannonMotor.set(CanonConstants.canonStop);
  }

  public void sirenOn() {
    sirenMotor.configOpenloopRamp(SirenConstants.sirenRampRate);
    sirenMotor.setVoltage(SirenConstants.sirenOnVoltage);
  }

  public void sirenOff() {
    sirenMotor.configOpenloopRamp(SirenConstants.sirenRampRate);
    sirenMotor.setVoltage(SirenConstants.sirenOffVoltage);
  }

}
