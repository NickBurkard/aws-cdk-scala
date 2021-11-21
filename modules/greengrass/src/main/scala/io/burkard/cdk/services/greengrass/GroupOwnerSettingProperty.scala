package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GroupOwnerSettingProperty {

  def apply(
    autoAddGroupOwner: Boolean,
    groupOwner: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty.Builder)
      .autoAddGroupOwner(autoAddGroupOwner)
      .groupOwner(groupOwner.orNull)
      .build()
}
