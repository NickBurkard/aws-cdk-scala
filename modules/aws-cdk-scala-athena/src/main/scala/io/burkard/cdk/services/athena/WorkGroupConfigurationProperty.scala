package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WorkGroupConfigurationProperty {

  def apply(
    enforceWorkGroupConfiguration: Option[Boolean] = None,
    requesterPaysEnabled: Option[Boolean] = None,
    bytesScannedCutoffPerQuery: Option[Number] = None,
    engineVersion: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty] = None,
    publishCloudWatchMetricsEnabled: Option[Boolean] = None,
    resultConfiguration: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty =
    (new software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty.Builder)
      .enforceWorkGroupConfiguration(enforceWorkGroupConfiguration.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requesterPaysEnabled(requesterPaysEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery.orNull)
      .engineVersion(engineVersion.orNull)
      .publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resultConfiguration(resultConfiguration.orNull)
      .build()
}
