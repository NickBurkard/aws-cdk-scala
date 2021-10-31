package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
