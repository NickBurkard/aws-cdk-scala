package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GoogleAnalyticsSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}