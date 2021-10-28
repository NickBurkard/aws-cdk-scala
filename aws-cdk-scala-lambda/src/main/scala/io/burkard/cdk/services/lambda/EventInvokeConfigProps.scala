package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventInvokeConfigProps {

  def apply(
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    function: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    qualifier: Option[String] = None,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.lambda.EventInvokeConfigProps =
    (new software.amazon.awscdk.services.lambda.EventInvokeConfigProps.Builder)
      .onSuccess(onSuccess.orNull)
      .function(function.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .qualifier(qualifier.orNull)
      .maxEventAge(maxEventAge.orNull)
      .build()
}
