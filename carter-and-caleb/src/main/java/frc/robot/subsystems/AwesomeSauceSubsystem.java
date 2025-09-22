// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AwesomeSauceSubsystem extends SubsystemBase {

  private TalonFX AwesomeSauceMotor;

  public AwesomeSauceSubsystem() {
    AwesomeSauceMotor = new TalonFX(1);
  }

  public void spinAwesomeSauceMotor() {
    AwesomeSauceMotor.setVoltage(5);
  }

public void stopAwesomeSauceMotor() {
  AwesomeSauceMotor.setVoltage(0);
}

public void MoveAwesomeSauce(double speed) {
  AwesomeSauceMotor.setVoltage(speed* 10);
}


  @Override
  public void periodic() {
    AwesomeSauceMotor.setVoltage(5);
  }


// Im the coolest

  
}


