package io.burkard.cdk.services.fis

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
