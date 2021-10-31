package io.burkard.cdk.services.fis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnExperimentTemplate {

  def apply(
    internalResourceId: String,
    targets: Option[Map[String, _]] = None,
    stopConditions: Option[List[_]] = None,
    roleArn: Option[String] = None,
    actions: Option[Map[String, _]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.fis.CfnExperimentTemplate =
    software.amazon.awscdk.services.fis.CfnExperimentTemplate.Builder
      .create(stackCtx, internalResourceId)
      .targets(targets.map(_.asJava).orNull)
      .stopConditions(stopConditions.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .actions(actions.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
