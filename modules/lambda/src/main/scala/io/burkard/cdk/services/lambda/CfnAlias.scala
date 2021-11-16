package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlias {

  def apply(
    internalResourceId: String,
    name: String,
    functionName: String,
    functionVersion: String,
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty] = None,
    routingConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnAlias =
    software.amazon.awscdk.services.lambda.CfnAlias.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .functionName(functionName)
      .functionVersion(functionVersion)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .routingConfig(routingConfig.orNull)
      .description(description.orNull)
      .build()
}
