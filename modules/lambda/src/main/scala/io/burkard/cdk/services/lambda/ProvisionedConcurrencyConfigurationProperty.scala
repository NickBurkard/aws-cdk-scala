package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProvisionedConcurrencyConfigurationProperty {

  def apply(
    provisionedConcurrentExecutions: Option[Number] = None
  ): software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty =
    (new software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions.orNull)
      .build()
}
