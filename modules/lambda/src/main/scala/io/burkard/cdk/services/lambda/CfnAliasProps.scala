package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAliasProps {

  def apply(
    name: String,
    functionName: String,
    functionVersion: String,
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty] = None,
    routingConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnAliasProps =
    (new software.amazon.awscdk.services.lambda.CfnAliasProps.Builder)
      .name(name)
      .functionName(functionName)
      .functionVersion(functionVersion)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .routingConfig(routingConfig.orNull)
      .description(description.orNull)
      .build()
}
