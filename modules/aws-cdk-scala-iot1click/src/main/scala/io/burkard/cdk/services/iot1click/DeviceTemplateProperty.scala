package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeviceTemplateProperty {

  def apply(
    deviceType: Option[String] = None,
    callbackOverrides: Option[AnyRef] = None
  ): software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty =
    (new software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder)
      .deviceType(deviceType.orNull)
      .callbackOverrides(callbackOverrides.orNull)
      .build()
}
