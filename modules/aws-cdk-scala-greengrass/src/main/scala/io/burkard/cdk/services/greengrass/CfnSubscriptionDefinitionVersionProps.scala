package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubscriptionDefinitionVersionProps {

  def apply(
    subscriptionDefinitionId: Option[String] = None,
    subscriptions: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps.Builder)
      .subscriptionDefinitionId(subscriptionDefinitionId.orNull)
      .subscriptions(subscriptions.map(_.asJava).orNull)
      .build()
}
