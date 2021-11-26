package io.burkard.cdk.services.cloudwatch

sealed abstract class TreatMissingData(val underlying: software.amazon.awscdk.services.cloudwatch.TreatMissingData)
  extends Product
    with Serializable

object TreatMissingData {
  implicit def toAws(value: TreatMissingData): software.amazon.awscdk.services.cloudwatch.TreatMissingData =
    Option(value).map(_.underlying).orNull

  case object Breaching
    extends TreatMissingData(software.amazon.awscdk.services.cloudwatch.TreatMissingData.BREACHING)

  case object Ignore
    extends TreatMissingData(software.amazon.awscdk.services.cloudwatch.TreatMissingData.IGNORE)

  case object Missing
    extends TreatMissingData(software.amazon.awscdk.services.cloudwatch.TreatMissingData.MISSING)

  case object NotBreaching
    extends TreatMissingData(software.amazon.awscdk.services.cloudwatch.TreatMissingData.NOT_BREACHING)
}
