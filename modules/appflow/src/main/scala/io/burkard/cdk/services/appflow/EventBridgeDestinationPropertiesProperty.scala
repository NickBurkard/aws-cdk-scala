package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBridgeDestinationPropertiesProperty {

  def apply(
    `object`: Option[String] = None,
    errorHandlingConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .errorHandlingConfig(errorHandlingConfig.orNull)
      .build()
}
