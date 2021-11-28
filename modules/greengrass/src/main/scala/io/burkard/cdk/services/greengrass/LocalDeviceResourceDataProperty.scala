package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocalDeviceResourceDataProperty {

  def apply(
    sourcePath: String,
    groupOwnerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.Builder)
      .sourcePath(sourcePath)
      .groupOwnerSetting(groupOwnerSetting.orNull)
      .build()
}
