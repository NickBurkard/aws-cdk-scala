package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeSigningConfig {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    allowedPublishers: Option[software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty] = None,
    codeSigningPolicies: Option[software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig =
    software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .allowedPublishers(allowedPublishers.orNull)
      .codeSigningPolicies(codeSigningPolicies.orNull)
      .build()
}
