package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceDownloadOwnerSettingProperty {

  def apply(
    groupOwner: Option[String] = None,
    groupPermission: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.Builder)
      .groupOwner(groupOwner.orNull)
      .groupPermission(groupPermission.orNull)
      .build()
}
