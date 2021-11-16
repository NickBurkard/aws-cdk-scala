package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceDownloadOwnerSettingProperty {

  def apply(
    groupOwner: String,
    groupPermission: String
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.Builder)
      .groupOwner(groupOwner)
      .groupPermission(groupPermission)
      .build()
}
