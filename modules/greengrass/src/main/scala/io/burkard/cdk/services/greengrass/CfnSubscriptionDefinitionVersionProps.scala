package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubscriptionDefinitionVersionProps {

  def apply(
    subscriptionDefinitionId: String,
    subscriptions: List[_]
  ): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps.Builder)
      .subscriptionDefinitionId(subscriptionDefinitionId)
      .subscriptions(subscriptions.asJava)
      .build()
}
