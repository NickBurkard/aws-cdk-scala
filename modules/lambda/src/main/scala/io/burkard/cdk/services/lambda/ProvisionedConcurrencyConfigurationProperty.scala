package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisionedConcurrencyConfigurationProperty {

  def apply(
    provisionedConcurrentExecutions: Number
  ): software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty =
    (new software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      .build()
}
