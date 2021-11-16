package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterCapacityProviderAssociations {

  def apply(
    internalResourceId: String,
    capacityProviders: List[String],
    cluster: String,
    defaultCapacityProviderStrategy: List[_]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations =
    software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.Builder
      .create(stackCtx, internalResourceId)
      .capacityProviders(capacityProviders.asJava)
      .cluster(cluster)
      .defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.asJava)
      .build()
}
