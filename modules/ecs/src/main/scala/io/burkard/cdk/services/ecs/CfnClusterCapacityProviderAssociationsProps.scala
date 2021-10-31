package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterCapacityProviderAssociationsProps {

  def apply(
    capacityProviders: Option[List[String]] = None,
    cluster: Option[String] = None,
    defaultCapacityProviderStrategy: Option[List[_]] = None
  ): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps =
    (new software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps.Builder)
      .capacityProviders(capacityProviders.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.map(_.asJava).orNull)
      .build()
}
