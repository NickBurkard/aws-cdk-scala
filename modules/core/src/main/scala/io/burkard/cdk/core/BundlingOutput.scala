package io.burkard.cdk.core


sealed abstract class BundlingOutput(val underlying: software.amazon.awscdk.BundlingOutput)
  extends Product
    with Serializable


object BundlingOutput {
  implicit def toAws(value: BundlingOutput): software.amazon.awscdk.BundlingOutput =
    Option(value).map(_.underlying).orNull

  case object Archived
    extends BundlingOutput(software.amazon.awscdk.BundlingOutput.ARCHIVED)

  case object NotArchived
    extends BundlingOutput(software.amazon.awscdk.BundlingOutput.NOT_ARCHIVED)

  case object AutoDiscover
    extends BundlingOutput(software.amazon.awscdk.BundlingOutput.AUTO_DISCOVER)
}
