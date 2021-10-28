package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubscriptionDefinitionVersion {

  def apply(
    internalResourceId: String,
    subscriptionDefinitionId: Option[String] = None,
    subscriptions: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .subscriptionDefinitionId(subscriptionDefinitionId.orNull)
      .subscriptions(subscriptions.map(_.asJava).orNull)
      .build()
}
