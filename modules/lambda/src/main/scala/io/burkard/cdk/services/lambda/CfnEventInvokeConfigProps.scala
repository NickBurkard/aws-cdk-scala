package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventInvokeConfigProps {

  def apply(
    qualifier: String,
    functionName: String,
    maximumEventAgeInSeconds: Option[Number] = None,
    destinationConfig: Option[software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty] = None,
    maximumRetryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps =
    (new software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps.Builder)
      .qualifier(qualifier)
      .functionName(functionName)
      .maximumEventAgeInSeconds(maximumEventAgeInSeconds.orNull)
      .destinationConfig(destinationConfig.orNull)
      .maximumRetryAttempts(maximumRetryAttempts.orNull)
      .build()
}
