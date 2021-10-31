package io.burkard.cdk.services.emrcontainers

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualCluster {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    containerProvider: Option[software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster =
    software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .containerProvider(containerProvider.orNull)
      .build()
}
