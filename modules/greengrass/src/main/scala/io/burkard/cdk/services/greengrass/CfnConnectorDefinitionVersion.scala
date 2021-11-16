package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectorDefinitionVersion {

  def apply(
    internalResourceId: String,
    connectors: List[_],
    connectorDefinitionId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .connectors(connectors.asJava)
      .connectorDefinitionId(connectorDefinitionId)
      .build()
}
