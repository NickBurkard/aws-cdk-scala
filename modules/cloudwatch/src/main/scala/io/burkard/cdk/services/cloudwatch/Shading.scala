package io.burkard.cdk.services.cloudwatch

sealed abstract class Shading(val underlying: software.amazon.awscdk.services.cloudwatch.Shading)
  extends Product
    with Serializable

object Shading {
  implicit def toAws(value: Shading): software.amazon.awscdk.services.cloudwatch.Shading =
    Option(value).map(_.underlying).orNull

  case object Above
    extends Shading(software.amazon.awscdk.services.cloudwatch.Shading.ABOVE)

  case object Below
    extends Shading(software.amazon.awscdk.services.cloudwatch.Shading.BELOW)

  case object None
    extends Shading(software.amazon.awscdk.services.cloudwatch.Shading.NONE)
}
