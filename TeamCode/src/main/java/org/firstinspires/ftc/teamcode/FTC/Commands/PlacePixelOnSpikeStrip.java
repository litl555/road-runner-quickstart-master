package org.firstinspires.ftc.teamcode.FTC.Commands;

import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.teamcode.FTC.Autonomous.TeamPropPosition;
import org.firstinspires.ftc.teamcode.FTC.Subsystems.ClawSubsystem;
import org.firstinspires.ftc.teamcode.FTC.Subsystems.Robot;

public class PlacePixelOnSpikeStrip extends SequentialCommandGroup {
    public PlacePixelOnSpikeStrip(TeamPropPosition pos) {
        addCommands(
                new ParallelCommandGroup(new DriveToSpikeStripF(pos), new GoToHeight(Robot.lift, Robot.claw, 1)),
                new UpdateClaw(Robot.claw, ClawSubsystem.ClawState.OPENONE)
        );
    }
}
