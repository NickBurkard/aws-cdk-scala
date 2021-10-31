package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StorageConnectorProperty {

  def apply(
    domains: Option[List[String]] = None,
    connectorType: Option[String] = None,
    resourceIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty =
    (new software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder)
      .domains(domains.map(_.asJava).orNull)
      .connectorType(connectorType.orNull)
      .resourceIdentifier(resourceIdentifier.orNull)
      .build()
}
