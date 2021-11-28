package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GroupOwnerSettingProperty {

  def apply(
    autoAddGroupOwner: Boolean,
    groupOwner: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty.Builder)
      .autoAddGroupOwner(autoAddGroupOwner)
      .groupOwner(groupOwner.orNull)
      .build()
}
