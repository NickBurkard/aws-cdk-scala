package io.burkard.cdk.services.appstream

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
