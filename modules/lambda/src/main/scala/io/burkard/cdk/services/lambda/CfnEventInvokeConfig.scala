package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventInvokeConfig {

  def apply(
    internalResourceId: String,
    maximumEventAgeInSeconds: Option[Number] = None,
    destinationConfig: Option[software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty] = None,
    maximumRetryAttempts: Option[Number] = None,
    qualifier: Option[String] = None,
    functionName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnEventInvokeConfig =
    software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.Builder
      .create(stackCtx, internalResourceId)
      .maximumEventAgeInSeconds(maximumEventAgeInSeconds.orNull)
      .destinationConfig(destinationConfig.orNull)
      .maximumRetryAttempts(maximumRetryAttempts.orNull)
      .qualifier(qualifier.orNull)
      .functionName(functionName.orNull)
      .build()
}
