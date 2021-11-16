package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisionedConcurrencyConfigProperty {

  def apply(
    provisionedConcurrentExecutions: String
  ): software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty.Builder)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      .build()
}
