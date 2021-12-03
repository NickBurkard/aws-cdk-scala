package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocalVolumeResourceDataProperty {

  def apply(
    sourcePath: String,
    destinationPath: String,
    groupOwnerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.Builder)
      .sourcePath(sourcePath)
      .destinationPath(destinationPath)
      .groupOwnerSetting(groupOwnerSetting.orNull)
      .build()
}
