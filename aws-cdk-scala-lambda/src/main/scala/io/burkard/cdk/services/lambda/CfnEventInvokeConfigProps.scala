package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEventInvokeConfigProps {

  def apply(
    maximumEventAgeInSeconds: Option[Number] = None,
    destinationConfig: Option[software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty] = None,
    maximumRetryAttempts: Option[Number] = None,
    qualifier: Option[String] = None,
    functionName: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps =
    (new software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps.Builder)
      .maximumEventAgeInSeconds(maximumEventAgeInSeconds.orNull)
      .destinationConfig(destinationConfig.orNull)
      .maximumRetryAttempts(maximumRetryAttempts.orNull)
      .qualifier(qualifier.orNull)
      .functionName(functionName.orNull)
      .build()
}
