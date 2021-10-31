package io.burkard.cdk.services.fis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExperimentTemplateActionProperty {

  def apply(
    targets: Option[Map[String, String]] = None,
    actionId: Option[String] = None,
    description: Option[String] = None,
    startAfter: Option[List[String]] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty.Builder)
      .targets(targets.map(_.asJava).orNull)
      .actionId(actionId.orNull)
      .description(description.orNull)
      .startAfter(startAfter.map(_.asJava).orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
