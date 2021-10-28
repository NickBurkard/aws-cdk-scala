package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Version {

  def apply(
    internalResourceId: String,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    description: Option[String] = None,
    lambda: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    codeSha256: Option[String] = None,
    provisionedConcurrentExecutions: Option[Number] = None,
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.Version =
    software.amazon.awscdk.services.lambda.Version.Builder
      .create(stackCtx, internalResourceId)
      .maxEventAge(maxEventAge.orNull)
      .description(description.orNull)
      .lambda(lambda.orNull)
      .codeSha256(codeSha256.orNull)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions.orNull)
      .onSuccess(onSuccess.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
