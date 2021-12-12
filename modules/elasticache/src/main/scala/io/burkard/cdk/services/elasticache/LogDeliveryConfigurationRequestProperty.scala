package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogDeliveryConfigurationRequestProperty {

  def apply(
    logType: String,
    destinationDetails: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty,
    destinationType: String,
    logFormat: String
  ): software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty =
    (new software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.Builder)
      .logType(logType)
      .destinationDetails(destinationDetails)
      .destinationType(destinationType)
      .logFormat(logFormat)
      .build()
}
