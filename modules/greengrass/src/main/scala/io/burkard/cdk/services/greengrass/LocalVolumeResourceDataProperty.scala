package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocalVolumeResourceDataProperty {

  def apply(
    sourcePath: Option[String] = None,
    destinationPath: Option[String] = None,
    groupOwnerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty.Builder)
      .sourcePath(sourcePath.orNull)
      .destinationPath(destinationPath.orNull)
      .groupOwnerSetting(groupOwnerSetting.orNull)
      .build()
}
