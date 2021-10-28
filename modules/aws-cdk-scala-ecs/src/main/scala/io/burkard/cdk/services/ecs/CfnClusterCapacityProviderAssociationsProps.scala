package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
