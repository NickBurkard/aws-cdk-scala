package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectorDefinition {

  def apply(
    internalResourceId: String,
    name: String,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnConnectorDefinition =
    software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
