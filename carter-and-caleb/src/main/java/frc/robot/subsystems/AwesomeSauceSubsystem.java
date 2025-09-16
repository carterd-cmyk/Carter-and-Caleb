// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AwesomeSauceSubsystem extends SubsystemBase {
  /** Creates a new AwesomeSauce. */
  
  private TalonFX AwesomeSauceMotor; 

  public AwesomeSauceSubsystem() {
    AwesomeSauceMotor = new TalonFX(0);
  } 

  public void spinAwesomeSauceMotor() {
    AwesomeSauceMotor.setVoltage(4);
  }

  public void stopAwesomeSauceMotor() {
    AwesomeSauceMotor.setVoltage(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
