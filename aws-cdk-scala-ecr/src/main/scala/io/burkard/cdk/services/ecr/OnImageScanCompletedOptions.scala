package io.burkard.cdk.services.ecr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnImageScanCompletedOptions {

  def apply(
    ruleName: Option[String] = None,
    description: Option[String] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    target: Option[software.amazon.awscdk.services.events.IRuleTarget] = None,
    imageTags: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions =
    (new software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions.Builder)
      .ruleName(ruleName.orNull)
      .description(description.orNull)
      .eventPattern(eventPattern.orNull)
      .target(target.orNull)
      .imageTags(imageTags.map(_.asJava).orNull)
      .build()
}
