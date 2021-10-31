package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceDefinition {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnDeviceDefinition =
    software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
