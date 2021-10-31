package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAliasProps {

  def apply(
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty] = None,
    name: Option[String] = None,
    functionName: Option[String] = None,
    routingConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty] = None,
    description: Option[String] = None,
    functionVersion: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnAliasProps =
    (new software.amazon.awscdk.services.lambda.CfnAliasProps.Builder)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .name(name.orNull)
      .functionName(functionName.orNull)
      .routingConfig(routingConfig.orNull)
      .description(description.orNull)
      .functionVersion(functionVersion.orNull)
      .build()
}
