package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventInvokeConfigProperty {

  def apply(
    maximumEventAgeInSeconds: Option[Number] = None,
    destinationConfig: Option[software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty] = None,
    maximumRetryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty.Builder)
      .maximumEventAgeInSeconds(maximumEventAgeInSeconds.orNull)
      .destinationConfig(destinationConfig.orNull)
      .maximumRetryAttempts(maximumRetryAttempts.orNull)
      .build()
}
