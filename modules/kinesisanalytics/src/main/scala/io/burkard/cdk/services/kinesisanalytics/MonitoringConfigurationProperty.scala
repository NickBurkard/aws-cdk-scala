package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringConfigurationProperty {

  def apply(
    configurationType: String,
    metricsLevel: Option[String] = None,
    logLevel: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder)
      .configurationType(configurationType)
      .metricsLevel(metricsLevel.orNull)
      .logLevel(logLevel.orNull)
      .build()
}
