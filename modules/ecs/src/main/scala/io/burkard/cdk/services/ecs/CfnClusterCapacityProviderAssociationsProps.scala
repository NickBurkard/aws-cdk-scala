package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterCapacityProviderAssociationsProps {

  def apply(
    capacityProviders: List[String],
    cluster: String,
    defaultCapacityProviderStrategy: List[_]
  ): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps =
    (new software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps.Builder)
      .capacityProviders(capacityProviders.asJava)
      .cluster(cluster)
      .defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.asJava)
      .build()
}
