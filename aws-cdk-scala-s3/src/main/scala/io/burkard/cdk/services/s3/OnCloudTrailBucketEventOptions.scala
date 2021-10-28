package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnCloudTrailBucketEventOptions {

  def apply(
    ruleName: Option[String] = None,
    description: Option[String] = None,
    paths: Option[List[String]] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    target: Option[software.amazon.awscdk.services.events.IRuleTarget] = None
  ): software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions =
    (new software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions.Builder)
      .ruleName(ruleName.orNull)
      .description(description.orNull)
      .paths(paths.map(_.asJava).orNull)
      .eventPattern(eventPattern.orNull)
      .target(target.orNull)
      .build()
}
