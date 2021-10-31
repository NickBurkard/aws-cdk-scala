package io.burkard.cdk.services.fis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExperimentTemplateTargetProperty {

  def apply(
    resourceType: Option[String] = None,
    resourceTags: Option[Map[String, String]] = None,
    filters: Option[List[_]] = None,
    resourceArns: Option[List[String]] = None,
    selectionMode: Option[String] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty.Builder)
      .resourceType(resourceType.orNull)
      .resourceTags(resourceTags.map(_.asJava).orNull)
      .filters(filters.map(_.asJava).orNull)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .selectionMode(selectionMode.orNull)
      .build()
}
