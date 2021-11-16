package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVersionProps {

  def apply(
    functionName: String,
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty] = None,
    description: Option[String] = None,
    codeSha256: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnVersionProps =
    (new software.amazon.awscdk.services.lambda.CfnVersionProps.Builder)
      .functionName(functionName)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .description(description.orNull)
      .codeSha256(codeSha256.orNull)
      .build()
}
