// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SirenConstants;
/** Add your docs here. */
public class SirenSubsystem {

    private WPI_TalonSRX sirenMotor; 

    public SirenSubsystem() {
        sirenMotor = new WPI_TalonSRX(SirenConstants.sirenMotorID);
    }

    @Override
    public void periodic() {

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
