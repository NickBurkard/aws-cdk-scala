package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceInstanceProperty {

  def apply(
    name: String,
    id: String,
    resourceDataContainer: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty.Builder)
      .name(name)
      .id(id)
      .resourceDataContainer(resourceDataContainer)
      .build()
}
