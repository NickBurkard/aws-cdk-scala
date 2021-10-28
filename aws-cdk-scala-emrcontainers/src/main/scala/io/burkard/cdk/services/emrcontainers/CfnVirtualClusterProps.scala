package io.burkard.cdk.services.emrcontainers

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualClusterProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    containerProvider: Option[software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty] = None
  ): software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps =
    (new software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .containerProvider(containerProvider.orNull)
      .build()
}
