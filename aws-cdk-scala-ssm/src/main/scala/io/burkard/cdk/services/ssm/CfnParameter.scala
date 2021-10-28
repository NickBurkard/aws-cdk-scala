package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnParameter {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tier: Option[String] = None,
    value: Option[String] = None,
    allowedPattern: Option[String] = None,
    policies: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    dataType: Option[String] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnParameter =
    software.amazon.awscdk.services.ssm.CfnParameter.Builder
      .create(stackCtx, internalResourceId)
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
