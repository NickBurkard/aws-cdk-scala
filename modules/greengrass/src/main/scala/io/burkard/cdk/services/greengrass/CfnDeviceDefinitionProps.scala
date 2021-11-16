package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceDefinitionProps {

  def apply(
    name: String,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps =
    (new software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps.Builder)
      .name(name)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
