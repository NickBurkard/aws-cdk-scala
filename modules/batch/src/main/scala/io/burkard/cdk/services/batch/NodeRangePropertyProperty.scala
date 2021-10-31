package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NodeRangePropertyProperty {

  def apply(
    container: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty] = None,
    targetNodes: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder)
      .container(container.orNull)
      .targetNodes(targetNodes.orNull)
      .build()
}
