package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectorDefinitionVersionProps {

  def apply(
    connectors: Option[List[_]] = None,
    connectorDefinitionId: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps.Builder)
      .connectors(connectors.map(_.asJava).orNull)
      .connectorDefinitionId(connectorDefinitionId.orNull)
      .build()
}
