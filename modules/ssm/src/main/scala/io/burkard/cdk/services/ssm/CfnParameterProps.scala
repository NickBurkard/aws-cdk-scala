package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParameterProps {

  def apply(
    name: Option[String] = None,
    tier: Option[String] = None,
    value: Option[String] = None,
    allowedPattern: Option[String] = None,
    policies: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    dataType: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnParameterProps =
    (new software.amazon.awscdk.services.ssm.CfnParameterProps.Builder)
      .name(name.orNull)
      .tier(tier.orNull)
      .value(value.orNull)
      .allowedPattern(allowedPattern.orNull)
      .policies(policies.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .dataType(dataType.orNull)
      .`type`(`type`.orNull)
      .build()
}
