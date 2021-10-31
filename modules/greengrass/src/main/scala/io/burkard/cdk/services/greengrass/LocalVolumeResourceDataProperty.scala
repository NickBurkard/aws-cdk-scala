package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LocalVolumeResourceDataProperty {

  def apply(
    sourcePath: Option[String] = None,
    destinationPath: Option[String] = None,
    groupOwnerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.Builder)
      .sourcePath(sourcePath.orNull)
      .destinationPath(destinationPath.orNull)
      .groupOwnerSetting(groupOwnerSetting.orNull)
      .build()
}
