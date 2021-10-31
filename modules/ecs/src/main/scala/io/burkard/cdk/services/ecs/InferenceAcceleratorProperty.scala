package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InferenceAcceleratorProperty {

  def apply(
    deviceName: Option[String] = None,
    deviceType: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty.Builder)
      .deviceName(deviceName.orNull)
      .deviceType(deviceType.orNull)
      .build()
}
