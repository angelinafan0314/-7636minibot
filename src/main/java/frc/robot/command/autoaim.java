package frc.robot.command;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.generated.TunerConstants;
import frc.robot.subsystem.CommandSwerveDrivetrain;
import frc.robot.subsystem.photonvision;

public class autoaim extends Command{
    private final photonvision photonvision = new photonvision();
    private final CommandSwerveDrivetrain SwerveDrivetrain = TunerConstants.DriveTrain;
    private final CommandXboxController joystick = new CommandXboxController(0);
    private final PIDController PIDController = new PIDController(0, 0, 0);

}
