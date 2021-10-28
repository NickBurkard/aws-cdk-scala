package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsCloudMapServiceDiscoveryProperty {

  def apply(
    namespaceName: Option[String] = None,
    serviceName: Option[String] = None,
    attributes: Option[List[_]] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder)
      .namespaceName(namespaceName.orNull)
      .serviceName(serviceName.orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .build()
}
