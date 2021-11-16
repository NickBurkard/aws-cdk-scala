package io.burkard.cdk.services.fis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnExperimentTemplate {

  def apply(
    internalResourceId: String,
    targets: Map[String, _],
    stopConditions: List[_],
    roleArn: String,
    description: String,
    tags: Map[String, String],
    actions: Option[Map[String, _]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.fis.CfnExperimentTemplate =
    software.amazon.awscdk.services.fis.CfnExperimentTemplate.Builder
      .create(stackCtx, internalResourceId)
      .targets(targets.asJava)
      .stopConditions(stopConditions.asJava)
      .roleArn(roleArn)
      .description(description)
      .tags(tags.asJava)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
