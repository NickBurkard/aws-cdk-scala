package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleTargetInputProperties {

  def apply(
    inputTemplate: Option[String] = None,
    inputPath: Option[String] = None,
    input: Option[String] = None,
    inputPathsMap: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.events.RuleTargetInputProperties =
    (new software.amazon.awscdk.services.events.RuleTargetInputProperties.Builder)
      .inputTemplate(inputTemplate.orNull)
      .inputPath(inputPath.orNull)
      .input(input.orNull)
      .inputPathsMap(inputPathsMap.map(_.asJava).orNull)
      .build()
}
