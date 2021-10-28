package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LocalDeviceResourceDataProperty {

  def apply(
    sourcePath: Option[String] = None,
    groupOwnerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.Builder)
      .sourcePath(sourcePath.orNull)
      .groupOwnerSetting(groupOwnerSetting.orNull)
      .build()
}
