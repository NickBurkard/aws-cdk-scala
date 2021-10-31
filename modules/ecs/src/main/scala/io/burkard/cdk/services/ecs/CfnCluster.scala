package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    capacityProviders: Option[List[String]] = None,
    clusterSettings: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    defaultCapacityProviderStrategy: Option[List[_]] = None,
    configuration: Option[software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty] = None,
    clusterName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnCluster =
    software.amazon.awscdk.services.ecs.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .capacityProviders(capacityProviders.map(_.asJava).orNull)
      .clusterSettings(clusterSettings.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.map(_.asJava).orNull)
      .configuration(configuration.orNull)
      .clusterName(clusterName.orNull)
      .build()
}
