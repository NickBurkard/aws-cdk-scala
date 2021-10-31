package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionProperty {

  def apply(
    source: Option[String] = None,
    subject: Option[String] = None,
    id: Option[String] = None,
    target: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty.Builder)
      .source(source.orNull)
      .subject(subject.orNull)
      .id(id.orNull)
      .target(target.orNull)
      .build()
}
