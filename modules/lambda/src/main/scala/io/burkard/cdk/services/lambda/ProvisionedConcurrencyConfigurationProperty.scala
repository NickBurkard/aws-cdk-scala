package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisionedConcurrencyConfigurationProperty {

  def apply(
    provisionedConcurrentExecutions: Number
  ): software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty =
    (new software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      .build()
}
