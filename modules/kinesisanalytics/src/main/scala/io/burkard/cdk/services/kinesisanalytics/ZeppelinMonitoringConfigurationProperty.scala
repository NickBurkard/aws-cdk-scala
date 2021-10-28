package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ZeppelinMonitoringConfigurationProperty {

  def apply(
    logLevel: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty.Builder)
      .logLevel(logLevel.orNull)
      .build()
}
