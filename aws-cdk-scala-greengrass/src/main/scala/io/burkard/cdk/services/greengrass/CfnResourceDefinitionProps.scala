package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
