package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputDeviceRequestProperty {

  def apply(
    id: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty.Builder)
      .id(id.orNull)
      .build()
}
