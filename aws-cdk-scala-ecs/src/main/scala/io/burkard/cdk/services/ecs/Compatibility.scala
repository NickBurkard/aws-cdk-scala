package io.burkard.cdk.services.ecs

sealed abstract class Compatibility(val underlying: software.amazon.awscdk.services.ecs.Compatibility)
  extends Product
    with Serializable

object Compatibility {
  implicit def toAws(value: Compatibility): software.amazon.awscdk.services.ecs.Compatibility =
    Option(value).map(_.underlying).orNull

  case object Ec2
    extends Compatibility(software.amazon.awscdk.services.ecs.Compatibility.EC2)

  case object Fargate
    extends Compatibility(software.amazon.awscdk.services.ecs.Compatibility.FARGATE)

  case object Ec2AndFargate
    extends Compatibility(software.amazon.awscdk.services.ecs.Compatibility.EC2_AND_FARGATE)

  case object External
    extends Compatibility(software.amazon.awscdk.services.ecs.Compatibility.EXTERNAL)
}
