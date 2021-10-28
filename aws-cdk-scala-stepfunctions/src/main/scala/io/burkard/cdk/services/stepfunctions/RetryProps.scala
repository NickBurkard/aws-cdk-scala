package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
