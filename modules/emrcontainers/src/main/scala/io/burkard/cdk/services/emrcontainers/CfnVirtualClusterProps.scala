package io.burkard.cdk.services.emrcontainers

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualClusterProps {

  def apply(
    name: String,
    containerProvider: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps =
    (new software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps.Builder)
      .name(name)
      .containerProvider(containerProvider)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
