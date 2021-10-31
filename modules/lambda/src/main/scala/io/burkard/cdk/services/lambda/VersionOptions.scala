package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VersionOptions {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    description: Option[String] = None,
    codeSha256: Option[String] = None,
    provisionedConcurrentExecutions: Option[Number] = None,
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.lambda.VersionOptions =
    (new software.amazon.awscdk.services.lambda.VersionOptions.Builder)
      .maxEventAge(maxEventAge.orNull)
      .description(description.orNull)
      .codeSha256(codeSha256.orNull)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions.orNull)
      .onSuccess(onSuccess.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
