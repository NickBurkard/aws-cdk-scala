package io.burkard.cdk.services.fis

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnExperimentTemplateProps {

  def apply(
    targets: Option[Map[String, _]] = None,
    stopConditions: Option[List[_]] = None,
    roleArn: Option[String] = None,
    actions: Option[Map[String, _]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplateProps =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplateProps.Builder)
      .targets(targets.map(_.asJava).orNull)
      .stopConditions(stopConditions.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .actions(actions.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
