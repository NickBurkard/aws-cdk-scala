package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeSigningConfigProps {

  def apply(
    allowedPublishers: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty,
    description: Option[String] = None,
    codeSigningPolicies: Option[software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty] = None
  ): software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps =
    (new software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps.Builder)
      .allowedPublishers(allowedPublishers)
      .description(description.orNull)
      .codeSigningPolicies(codeSigningPolicies.orNull)
      .build()
}
