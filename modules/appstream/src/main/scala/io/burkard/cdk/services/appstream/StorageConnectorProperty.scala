package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StorageConnectorProperty {

  def apply(
    connectorType: String,
    domains: Option[List[String]] = None,
    resourceIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty =
    (new software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder)
      .connectorType(connectorType)
      .domains(domains.map(_.asJava).orNull)
      .resourceIdentifier(resourceIdentifier.orNull)
      .build()
}
