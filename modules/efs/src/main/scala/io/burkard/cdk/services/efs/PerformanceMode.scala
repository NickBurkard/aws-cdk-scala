package io.burkard.cdk.services.efs

sealed abstract class PerformanceMode(val underlying: software.amazon.awscdk.services.efs.PerformanceMode)
  extends Product
    with Serializable

object PerformanceMode {
  implicit def toAws(value: PerformanceMode): software.amazon.awscdk.services.efs.PerformanceMode =
    Option(value).map(_.underlying).orNull

  case object GeneralPurpose
    extends PerformanceMode(software.amazon.awscdk.services.efs.PerformanceMode.GENERAL_PURPOSE)

  case object MaxIo
    extends PerformanceMode(software.amazon.awscdk.services.efs.PerformanceMode.MAX_IO)
}
