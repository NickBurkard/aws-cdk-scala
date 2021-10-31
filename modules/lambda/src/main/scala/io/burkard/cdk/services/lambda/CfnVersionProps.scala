package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVersionProps {

  def apply(
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty] = None,
    functionName: Option[String] = None,
    description: Option[String] = None,
    codeSha256: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnVersionProps =
    (new software.amazon.awscdk.services.lambda.CfnVersionProps.Builder)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .functionName(functionName.orNull)
      .description(description.orNull)
      .codeSha256(codeSha256.orNull)
      .build()
}
