package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggerDefinitionProps {

  def apply(
    name: String,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps =
    (new software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps.Builder)
      .name(name)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
