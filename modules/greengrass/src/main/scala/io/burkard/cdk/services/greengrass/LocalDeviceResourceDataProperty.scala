package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocalDeviceResourceDataProperty {

  def apply(
    sourcePath: String,
    groupOwnerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty.Builder)
      .sourcePath(sourcePath)
      .groupOwnerSetting(groupOwnerSetting.orNull)
      .build()
}
