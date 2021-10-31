package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVersion {

  def apply(
    internalResourceId: String,
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty] = None,
    functionName: Option[String] = None,
    description: Option[String] = None,
    codeSha256: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnVersion =
    software.amazon.awscdk.services.lambda.CfnVersion.Builder
      .create(stackCtx, internalResourceId)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .functionName(functionName.orNull)
      .description(description.orNull)
      .codeSha256(codeSha256.orNull)
      .build()
}
