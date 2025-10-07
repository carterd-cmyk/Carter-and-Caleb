// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AwesomeSauceSubsystem extends SubsystemBase {

  public enum LauncherState {
    S_empty, S_filled, S_launching
  }

  public static LauncherState mLauncherState;

  private TalonFX AwesomeSauceMotor;

  public AwesomeSauceSubsystem() {
    AwesomeSauceMotor = new TalonFX(1);
    mLauncherState = LauncherState.S_empty;
  }

  public void spinAwesomeSauceMotor() {
    AwesomeSauceMotor.setVoltage(5);
  }

  public void stopAwesomeSauceMotor() {
  AwesomeSauceMotor.setVoltage(0);
  }

  public void MoveAwesomeSauce() {
  AwesomeSauceMotor.setVoltage(10);
  }

  public void runLauncherState(){
    switch(mLauncherState){
      case S_empty:
      spinAwesomeSauceMotor();
      break;
      case S_filled:
      stopAwesomeSauceMotor();
      break;
      case S_launching:
      MoveAwesomeSauce();
      break;
    }

  }
@Override
  public void periodic() {
    runLauncherState();


// Im the coolest

}

}



