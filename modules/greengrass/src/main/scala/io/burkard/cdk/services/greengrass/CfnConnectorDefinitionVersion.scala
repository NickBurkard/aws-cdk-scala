package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectorDefinitionVersion {

  def apply(
    internalResourceId: String,
    connectors: Option[List[_]] = None,
    connectorDefinitionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .connectors(connectors.map(_.asJava).orNull)
      .connectorDefinitionId(connectorDefinitionId.orNull)
      .build()
}
