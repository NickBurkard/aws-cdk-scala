package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionProperty {

  def apply(
    source: String,
    subject: String,
    id: String,
    target: String
  ): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty.Builder)
      .source(source)
      .subject(subject)
      .id(id)
      .target(target)
      .build()
}
