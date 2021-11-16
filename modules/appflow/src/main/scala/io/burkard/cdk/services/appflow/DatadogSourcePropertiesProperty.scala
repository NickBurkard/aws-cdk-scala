package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatadogSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
