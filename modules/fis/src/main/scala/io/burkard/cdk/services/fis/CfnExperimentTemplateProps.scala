package io.burkard.cdk.services.fis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnExperimentTemplateProps {

  def apply(
    targets: Map[String, _],
    stopConditions: List[_],
    roleArn: String,
    description: String,
    tags: Map[String, String],
    actions: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplateProps =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplateProps.Builder)
      .targets(targets.asJava)
      .stopConditions(stopConditions.asJava)
      .roleArn(roleArn)
      .description(description)
      .tags(tags.asJava)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
