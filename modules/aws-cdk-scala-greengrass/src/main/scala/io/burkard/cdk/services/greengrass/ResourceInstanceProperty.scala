package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceInstanceProperty {

  def apply(
    name: Option[String] = None,
    id: Option[String] = None,
    resourceDataContainer: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty.Builder)
      .name(name.orNull)
      .id(id.orNull)
      .resourceDataContainer(resourceDataContainer.orNull)
      .build()
}
