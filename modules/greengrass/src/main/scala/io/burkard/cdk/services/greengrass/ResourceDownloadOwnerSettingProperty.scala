package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceDownloadOwnerSettingProperty {

  def apply(
    groupOwner: Option[String] = None,
    groupPermission: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty.Builder)
      .groupOwner(groupOwner.orNull)
      .groupPermission(groupPermission.orNull)
      .build()
}
