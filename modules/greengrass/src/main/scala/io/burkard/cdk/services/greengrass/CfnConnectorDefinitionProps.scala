package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectorDefinitionProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps =
    (new software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
