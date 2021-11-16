package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasProps {

  def apply(
    version: software.amazon.awscdk.services.lambda.IVersion,
    aliasName: String,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    description: Option[String] = None,
    additionalVersions: Option[List[_ <: software.amazon.awscdk.services.lambda.VersionWeight]] = None,
    provisionedConcurrentExecutions: Option[Number] = None,
    retryAttempts: Option[Number] = None,
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None
  ): software.amazon.awscdk.services.lambda.AliasProps =
    (new software.amazon.awscdk.services.lambda.AliasProps.Builder)
      .version(version)
      .aliasName(aliasName)
      .maxEventAge(maxEventAge.orNull)
      .description(description.orNull)
      .additionalVersions(additionalVersions.map(_.asJava).orNull)
      .provisionedConcurrentExecutions(provisionedConcurrentExecutions.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onSuccess(onSuccess.orNull)
      .onFailure(onFailure.orNull)
      .build()
}
