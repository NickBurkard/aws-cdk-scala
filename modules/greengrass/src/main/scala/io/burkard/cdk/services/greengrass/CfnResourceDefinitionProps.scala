package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceDefinitionProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
