package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeSigningConfig {

  def apply(
    internalResourceId: String,
    allowedPublishers: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty,
    description: Option[String] = None,
    codeSigningPolicies: Option[software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig =
    software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.Builder
      .create(stackCtx, internalResourceId)
      .allowedPublishers(allowedPublishers)
      .description(description.orNull)
      .codeSigningPolicies(codeSigningPolicies.orNull)
      .build()
}
