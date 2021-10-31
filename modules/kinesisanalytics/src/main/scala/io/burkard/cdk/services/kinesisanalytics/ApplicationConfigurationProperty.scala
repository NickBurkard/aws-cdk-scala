package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationConfigurationProperty {

  def apply(
    applicationCodeConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty] = None,
    zeppelinApplicationConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty] = None,
    applicationSnapshotConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty] = None,
    flinkApplicationConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty] = None,
    sqlApplicationConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty] = None,
    environmentProperties: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder)
      .applicationCodeConfiguration(applicationCodeConfiguration.orNull)
      .zeppelinApplicationConfiguration(zeppelinApplicationConfiguration.orNull)
      .applicationSnapshotConfiguration(applicationSnapshotConfiguration.orNull)
      .flinkApplicationConfiguration(flinkApplicationConfiguration.orNull)
      .sqlApplicationConfiguration(sqlApplicationConfiguration.orNull)
      .environmentProperties(environmentProperties.orNull)
      .build()
}
