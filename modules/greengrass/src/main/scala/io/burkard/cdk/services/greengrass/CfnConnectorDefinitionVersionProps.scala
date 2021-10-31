package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
