package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
