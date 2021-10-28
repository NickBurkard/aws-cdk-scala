package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProvisionedConcurrencyConfigProperty {

  def apply(
    provisionedConcurrentExecutions: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty.Builder)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions.orNull)
      .build()
}
