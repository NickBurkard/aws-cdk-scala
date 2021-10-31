package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WorkGroupConfigurationUpdatesProperty {

  def apply(
    enforceWorkGroupConfiguration: Option[Boolean] = None,
    resultConfigurationUpdates: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty] = None,
    removeBytesScannedCutoffPerQuery: Option[Boolean] = None,
    publishCloudWatchMetricsEnabled: Option[Boolean] = None,
    requesterPaysEnabled: Option[Boolean] = None,
    bytesScannedCutoffPerQuery: Option[Number] = None,
    engineVersion: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty =
    (new software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder)
      .enforceWorkGroupConfiguration(enforceWorkGroupConfiguration.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resultConfigurationUpdates(resultConfigurationUpdates.orNull)
      .removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requesterPaysEnabled(requesterPaysEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery.orNull)
      .engineVersion(engineVersion.orNull)
      .build()
}
