package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventInvokeConfigOptions {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None
  ): software.amazon.awscdk.services.lambda.EventInvokeConfigOptions =
    (new software.amazon.awscdk.services.lambda.EventInvokeConfigOptions.Builder)
      .maxEventAge(maxEventAge.orNull)
      .onSuccess(onSuccess.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .build()
}
