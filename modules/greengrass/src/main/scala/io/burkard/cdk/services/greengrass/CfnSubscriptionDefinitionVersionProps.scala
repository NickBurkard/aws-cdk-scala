package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
