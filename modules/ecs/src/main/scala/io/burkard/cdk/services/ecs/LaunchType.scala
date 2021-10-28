package io.burkard.cdk.services.ecs

sealed abstract class LaunchType(val underlying: software.amazon.awscdk.services.ecs.LaunchType)
  extends Product
    with Serializable

object LaunchType {
  implicit def toAws(value: LaunchType): software.amazon.awscdk.services.ecs.LaunchType =
    Option(value).map(_.underlying).orNull

  case object Ec2
    extends LaunchType(software.amazon.awscdk.services.ecs.LaunchType.EC2)

  case object Fargate
    extends LaunchType(software.amazon.awscdk.services.ecs.LaunchType.FARGATE)

  case object External
    extends LaunchType(software.amazon.awscdk.services.ecs.LaunchType.EXTERNAL)
}
