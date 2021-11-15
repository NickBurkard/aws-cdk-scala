package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogDeliveryConfigurationRequestProperty {

  def apply(
    logType: Option[String] = None,
    destinationDetails: Option[software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty] = None,
    destinationType: Option[String] = None,
    logFormat: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty =
    (new software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty.Builder)
      .logType(logType.orNull)
      .destinationDetails(destinationDetails.orNull)
      .destinationType(destinationType.orNull)
      .logFormat(logFormat.orNull)
      .build()
}
