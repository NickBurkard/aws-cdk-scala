package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationConfigProperty {

  def apply(
    onSuccess: Option[software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty] = None
  ): software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty.Builder)
      .onSuccess(onSuccess.orNull)
      .onFailure(onFailure.orNull)
      .build()
}
