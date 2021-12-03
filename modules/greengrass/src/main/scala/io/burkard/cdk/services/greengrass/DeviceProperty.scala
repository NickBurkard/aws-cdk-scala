package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceProperty {

  def apply(
    certificateArn: String,
    id: String,
    thingArn: String,
    syncShadow: Option[Boolean] = None
  ): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty =
    (new software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty.Builder)
      .certificateArn(certificateArn)
      .id(id)
      .thingArn(thingArn)
      .syncShadow(syncShadow.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
