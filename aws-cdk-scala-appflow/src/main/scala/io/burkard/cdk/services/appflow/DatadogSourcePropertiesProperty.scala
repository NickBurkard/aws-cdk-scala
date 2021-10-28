package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatadogSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
