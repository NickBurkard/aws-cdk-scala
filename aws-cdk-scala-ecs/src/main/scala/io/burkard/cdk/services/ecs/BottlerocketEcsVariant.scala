package io.burkard.cdk.services.ecs

sealed abstract class BottlerocketEcsVariant(val underlying: software.amazon.awscdk.services.ecs.BottlerocketEcsVariant)
  extends Product
    with Serializable

object BottlerocketEcsVariant {
  implicit def toAws(value: BottlerocketEcsVariant): software.amazon.awscdk.services.ecs.BottlerocketEcsVariant =
    Option(value).map(_.underlying).orNull

  case object AwsEcs1
    extends BottlerocketEcsVariant(software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_1)
}
