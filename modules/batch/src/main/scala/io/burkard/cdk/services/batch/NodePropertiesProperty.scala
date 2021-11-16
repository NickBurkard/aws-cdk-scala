package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NodePropertiesProperty {

  def apply(
    nodeRangeProperties: List[_],
    mainNode: Number,
    numNodes: Number
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder)
      .nodeRangeProperties(nodeRangeProperties.asJava)
      .mainNode(mainNode)
      .numNodes(numNodes)
      .build()
}
