package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeSigningConfigProps {

  def apply(
    description: Option[String] = None,
    allowedPublishers: Option[software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty] = None,
    codeSigningPolicies: Option[software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty] = None
  ): software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps =
    (new software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps.Builder)
      .description(description.orNull)
      .allowedPublishers(allowedPublishers.orNull)
      .codeSigningPolicies(codeSigningPolicies.orNull)
      .build()
}
