package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NodePropertiesProperty {

  def apply(
    nodeRangeProperties: Option[List[_]] = None,
    mainNode: Option[Number] = None,
    numNodes: Option[Number] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder)
      .nodeRangeProperties(nodeRangeProperties.map(_.asJava).orNull)
      .mainNode(mainNode.orNull)
      .numNodes(numNodes.orNull)
      .build()
}
