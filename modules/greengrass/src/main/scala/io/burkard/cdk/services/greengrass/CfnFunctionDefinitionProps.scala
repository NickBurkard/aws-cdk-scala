package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFunctionDefinitionProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
