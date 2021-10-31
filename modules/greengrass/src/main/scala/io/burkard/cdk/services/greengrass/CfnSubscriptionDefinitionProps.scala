package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubscriptionDefinitionProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps =
    (new software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
