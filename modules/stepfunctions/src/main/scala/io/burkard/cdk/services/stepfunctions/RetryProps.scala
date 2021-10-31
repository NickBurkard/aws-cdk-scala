package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RetryProps {

  def apply(
    errors: Option[List[String]] = None,
    maxAttempts: Option[Number] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    backoffRate: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.RetryProps =
    (new software.amazon.awscdk.services.stepfunctions.RetryProps.Builder)
      .errors(errors.map(_.asJava).orNull)
      .maxAttempts(maxAttempts.orNull)
      .interval(interval.orNull)
      .backoffRate(backoffRate.orNull)
      .build()
}
