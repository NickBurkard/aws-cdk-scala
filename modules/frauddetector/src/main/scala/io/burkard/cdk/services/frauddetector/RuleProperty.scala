package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    arn: Option[String] = None,
    detectorId: Option[String] = None,
    outcomes: Option[List[_]] = None,
    createdTime: Option[String] = None,
    ruleId: Option[String] = None,
    lastUpdatedTime: Option[String] = None,
    ruleVersion: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    language: Option[String] = None,
    expression: Option[String] = None
  ): software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty =
    (new software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty.Builder)
      .arn(arn.orNull)
      .detectorId(detectorId.orNull)
      .outcomes(outcomes.map(_.asJava).orNull)
      .createdTime(createdTime.orNull)
      .ruleId(ruleId.orNull)
      .lastUpdatedTime(lastUpdatedTime.orNull)
      .ruleVersion(ruleVersion.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .language(language.orNull)
      .expression(expression.orNull)
      .build()
}
