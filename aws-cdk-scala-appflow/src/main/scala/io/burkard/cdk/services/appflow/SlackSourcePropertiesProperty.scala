package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SlackSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
