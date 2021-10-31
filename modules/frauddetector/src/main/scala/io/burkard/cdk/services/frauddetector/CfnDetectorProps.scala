package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDetectorProps {

  def apply(
    detectorId: Option[String] = None,
    rules: Option[List[_]] = None,
    ruleExecutionMode: Option[String] = None,
    eventType: Option[software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty] = None,
    detectorVersionStatus: Option[String] = None,
    description: Option[String] = None,
    associatedModels: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnDetectorProps =
    (new software.amazon.awscdk.services.frauddetector.CfnDetectorProps.Builder)
      .detectorId(detectorId.orNull)
      .rules(rules.map(_.asJava).orNull)
      .ruleExecutionMode(ruleExecutionMode.orNull)
      .eventType(eventType.orNull)
      .detectorVersionStatus(detectorVersionStatus.orNull)
      .description(description.orNull)
      .associatedModels(associatedModels.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
