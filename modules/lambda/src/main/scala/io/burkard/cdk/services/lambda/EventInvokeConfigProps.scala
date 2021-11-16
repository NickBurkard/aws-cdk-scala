package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventInvokeConfigProps {

  def apply(
    function: software.amazon.awscdk.services.lambda.IFunction,
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    qualifier: Option[String] = None,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.lambda.EventInvokeConfigProps =
    (new software.amazon.awscdk.services.lambda.EventInvokeConfigProps.Builder)
      .function(function)
      .onSuccess(onSuccess.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .qualifier(qualifier.orNull)
      .maxEventAge(maxEventAge.orNull)
      .build()
}
