package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SlackSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
