package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCoreDefinitionProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps =
    (new software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
