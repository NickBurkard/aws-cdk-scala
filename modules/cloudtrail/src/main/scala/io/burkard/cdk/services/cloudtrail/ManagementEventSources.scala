package io.burkard.cdk.services.cloudtrail

sealed abstract class ManagementEventSources(val underlying: software.amazon.awscdk.services.cloudtrail.ManagementEventSources)
  extends Product
    with Serializable

object ManagementEventSources {
  implicit def toAws(value: ManagementEventSources): software.amazon.awscdk.services.cloudtrail.ManagementEventSources =
    Option(value).map(_.underlying).orNull

  case object Kms
    extends ManagementEventSources(software.amazon.awscdk.services.cloudtrail.ManagementEventSources.KMS)

  case object RdsDataApi
    extends ManagementEventSources(software.amazon.awscdk.services.cloudtrail.ManagementEventSources.RDS_DATA_API)
}
