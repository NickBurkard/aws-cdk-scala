package io.burkard.cdk.services.efs


sealed abstract class ThroughputMode(val underlying: software.amazon.awscdk.services.efs.ThroughputMode)
  extends Product
    with Serializable


object ThroughputMode {
  implicit def toAws(value: ThroughputMode): software.amazon.awscdk.services.efs.ThroughputMode =
    Option(value).map(_.underlying).orNull

  case object Bursting
    extends ThroughputMode(software.amazon.awscdk.services.efs.ThroughputMode.BURSTING)

  case object Provisioned
    extends ThroughputMode(software.amazon.awscdk.services.efs.ThroughputMode.PROVISIONED)
}
