package io.burkard.cdk.services.ec2


sealed abstract class InstanceInitiatedShutdownBehavior(val underlying: software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior)
  extends Product
    with Serializable


object InstanceInitiatedShutdownBehavior {
  implicit def toAws(value: InstanceInitiatedShutdownBehavior): software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior =
    Option(value).map(_.underlying).orNull

  case object Stop
    extends InstanceInitiatedShutdownBehavior(software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior.STOP)

  case object Terminate
    extends InstanceInitiatedShutdownBehavior(software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior.TERMINATE)
}
