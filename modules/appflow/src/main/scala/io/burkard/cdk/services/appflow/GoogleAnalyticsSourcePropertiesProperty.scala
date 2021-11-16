package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GoogleAnalyticsSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
