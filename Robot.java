// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms ofz
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj.TimedRobot;

/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  public PS5Controller controller = new PS5Controller(0);
  public TalonFX outtakeMotor = new TalonFX(0);
  public TalonFX intakeMotor = new TalonFX(17);                       
  public Robot() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    outtakeMotor.set(0.5);
    System.out.println(controller.getCircleButton());
    if (controller.getTriangleButton()) {
      outtakeMotor.set(.25);
    }
    else {
      outtakeMotor.set(0);
    }
    if (controller.getCircleButton()){
      intakeMotor.set(.7);
    } 
    else {
      intakeMotor.set(0);
    }
    if (outtakeMotor.getStatorCurrent().getValueAsDouble() > 5) {
    }                                                                                                                                                                                                                                                                                       
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
