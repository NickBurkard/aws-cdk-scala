package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubscriptionDefinition {

  def apply(
    internalResourceId: String,
    name: String,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition =
    software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
