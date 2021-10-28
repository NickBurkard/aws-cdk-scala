package io.burkard.cdk.services.cloudwatch

sealed abstract class Ec2InstanceAction(val underlying: software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction)
  extends Product
    with Serializable

object Ec2InstanceAction {
  implicit def toAws(value: Ec2InstanceAction): software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction =
    Option(value).map(_.underlying).orNull

  case object Stop
    extends Ec2InstanceAction(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.STOP)

  case object Terminate
    extends Ec2InstanceAction(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.TERMINATE)

  case object Recover
    extends Ec2InstanceAction(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.RECOVER)

  case object Reboot
    extends Ec2InstanceAction(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.REBOOT)
}
