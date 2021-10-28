package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StringParameterProps {

  def apply(
    simpleName: Option[Boolean] = None,
    tier: Option[software.amazon.awscdk.services.ssm.ParameterTier] = None,
    description: Option[String] = None,
    stringValue: Option[String] = None,
    parameterName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.ssm.ParameterType] = None,
    allowedPattern: Option[String] = None
  ): software.amazon.awscdk.services.ssm.StringParameterProps =
    (new software.amazon.awscdk.services.ssm.StringParameterProps.Builder)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tier(tier.orNull)
      .description(description.orNull)
      .stringValue(stringValue.orNull)
      .parameterName(parameterName.orNull)
      .`type`(`type`.orNull)
      .allowedPattern(allowedPattern.orNull)
      .build()
}
