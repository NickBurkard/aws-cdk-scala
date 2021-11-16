package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NodeRangePropertyProperty {

  def apply(
    targetNodes: String,
    container: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder)
      .targetNodes(targetNodes)
      .container(container.orNull)
      .build()
}
