package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlias {

  def apply(
    internalResourceId: String,
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty] = None,
    name: Option[String] = None,
    functionName: Option[String] = None,
    routingConfig: Option[software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty] = None,
    description: Option[String] = None,
    functionVersion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnAlias =
    software.amazon.awscdk.services.lambda.CfnAlias.Builder
      .create(stackCtx, internalResourceId)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .name(name.orNull)
      .functionName(functionName.orNull)
      .routingConfig(routingConfig.orNull)
      .description(description.orNull)
      .functionVersion(functionVersion.orNull)
      .build()
}
