package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubscriptionDefinitionVersionProperty {

  def apply(
    subscriptions: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder)
      .subscriptions(subscriptions.map(_.asJava).orNull)
      .build()
}
