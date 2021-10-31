package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasOptions {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    description: Option[String] = None,
    additionalVersions: Option[List[_ <: software.amazon.awscdk.services.lambda.VersionWeight]] = None,
    provisionedConcurrentExecutions: Option[Number] = None,
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None
  ): software.amazon.awscdk.services.lambda.AliasOptions =
    (new software.amazon.awscdk.services.lambda.AliasOptions.Builder)
      .maxEventAge(maxEventAge.orNull)
      .description(description.orNull)
      .additionalVersions(additionalVersions.map(_.asJava).orNull)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions.orNull)
      .onSuccess(onSuccess.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .build()
}
