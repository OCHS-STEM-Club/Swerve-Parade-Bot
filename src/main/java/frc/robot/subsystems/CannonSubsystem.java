// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.MotorCommutation;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CannonSubsystem extends SubsystemBase {
  /** Creates a new cannonSubsystem. */
  private WPI_TalonSRX shooterSolenoid;

  private AnalogInput pressureSensor;

  private CANSparkMax cannonMotor;

  public CannonSubsystem() {
    shooterSolenoid = new WPI_TalonSRX(20);

    pressureSensor = new AnalogInput(3);

    cannonMotor = new CANSparkMax(21, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shooterOpen() {
    shooterSolenoid.setVoltage(12);
  }

  public void shooterClose() {
    shooterSolenoid.setVoltage(0);
  }

  public double getPressureSensor() { 
    return pressureSensor.getAccumulatorValue();
  }

  public void cannonUp() {
    cannonMotor.set(0.2);
  }

  public void cannonDown() {
    cannonMotor.set(-0.2);
  }
}
