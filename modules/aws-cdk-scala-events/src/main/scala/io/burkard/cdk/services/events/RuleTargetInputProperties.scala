package io.burkard.cdk.services.events

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
