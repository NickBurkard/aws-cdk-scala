package io.burkard.cdk.services.emrcontainers

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualCluster {

  def apply(
    internalResourceId: String,
    name: String,
    containerProvider: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster =
    software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .containerProvider(containerProvider)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
