package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterCapacityProviderAssociations {

  def apply(
    internalResourceId: String,
    capacityProviders: Option[List[String]] = None,
    cluster: Option[String] = None,
    defaultCapacityProviderStrategy: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations =
    software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.Builder
      .create(stackCtx, internalResourceId)
      .capacityProviders(capacityProviders.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.map(_.asJava).orNull)
      .build()
}
