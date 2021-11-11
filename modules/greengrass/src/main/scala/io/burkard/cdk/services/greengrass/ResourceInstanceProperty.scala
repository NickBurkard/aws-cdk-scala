package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceInstanceProperty {

  def apply(
    name: Option[String] = None,
    id: Option[String] = None,
    resourceDataContainer: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty.Builder)
      .name(name.orNull)
      .id(id.orNull)
      .resourceDataContainer(resourceDataContainer.orNull)
      .build()
}
