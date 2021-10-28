package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StringParameter {

  def apply(
    internalResourceId: String,
    simpleName: Option[Boolean] = None,
    tier: Option[software.amazon.awscdk.services.ssm.ParameterTier] = None,
    description: Option[String] = None,
    stringValue: Option[String] = None,
    parameterName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.ssm.ParameterType] = None,
    allowedPattern: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.StringParameter =
    software.amazon.awscdk.services.ssm.StringParameter.Builder
      .create(stackCtx, internalResourceId)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tier(tier.orNull)
      .description(description.orNull)
      .stringValue(stringValue.orNull)
      .parameterName(parameterName.orNull)
      .`type`(`type`.orNull)
      .allowedPattern(allowedPattern.orNull)
      .build()
}
