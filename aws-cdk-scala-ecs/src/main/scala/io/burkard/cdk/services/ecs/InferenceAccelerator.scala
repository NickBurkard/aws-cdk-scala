package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InferenceAccelerator {

  def apply(
    deviceName: Option[String] = None,
    deviceType: Option[String] = None
  ): software.amazon.awscdk.services.ecs.InferenceAccelerator =
    (new software.amazon.awscdk.services.ecs.InferenceAccelerator.Builder)
      .deviceName(deviceName.orNull)
      .deviceType(deviceType.orNull)
      .build()
}
