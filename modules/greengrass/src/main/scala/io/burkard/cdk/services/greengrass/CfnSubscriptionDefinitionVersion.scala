package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
