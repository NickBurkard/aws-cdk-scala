package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeviceProperty {

  def apply(
    certificateArn: Option[String] = None,
    id: Option[String] = None,
    thingArn: Option[String] = None,
    syncShadow: Option[Boolean] = None
  ): software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty =
    (new software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty.Builder)
      .certificateArn(certificateArn.orNull)
      .id(id.orNull)
      .thingArn(thingArn.orNull)
      .syncShadow(syncShadow.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
