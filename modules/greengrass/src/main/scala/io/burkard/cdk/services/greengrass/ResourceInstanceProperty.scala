package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceInstanceProperty {

  def apply(
    name: String,
    id: String,
    resourceDataContainer: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty.Builder)
      .name(name)
      .id(id)
      .resourceDataContainer(resourceDataContainer)
      .build()
}
