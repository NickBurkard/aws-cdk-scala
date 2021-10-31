package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatadogSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
