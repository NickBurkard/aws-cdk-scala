package io.burkard.cdk.services.fis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExperimentTemplateTargetFilterProperty {

  def apply(
    path: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.Builder)
      .path(path.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
