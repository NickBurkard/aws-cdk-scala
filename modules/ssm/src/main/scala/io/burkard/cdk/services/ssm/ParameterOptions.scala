package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterOptions {

  def apply(
    simpleName: Option[Boolean] = None,
    tier: Option[software.amazon.awscdk.services.ssm.ParameterTier] = None,
    description: Option[String] = None,
    parameterName: Option[String] = None,
    allowedPattern: Option[String] = None
  ): software.amazon.awscdk.services.ssm.ParameterOptions =
    (new software.amazon.awscdk.services.ssm.ParameterOptions.Builder)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tier(tier.orNull)
      .description(description.orNull)
      .parameterName(parameterName.orNull)
      .allowedPattern(allowedPattern.orNull)
      .build()
}
