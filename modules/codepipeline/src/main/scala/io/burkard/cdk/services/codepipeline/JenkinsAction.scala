package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JenkinsAction {

  def apply(
    projectName: Option[String] = None,
    jenkinsProvider: Option[software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider] = None,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    inputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType] = None
  ): software.amazon.awscdk.services.codepipeline.actions.JenkinsAction =
    software.amazon.awscdk.services.codepipeline.actions.JenkinsAction.Builder
      .create()
      .projectName(projectName.orNull)
      .jenkinsProvider(jenkinsProvider.orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .inputs(inputs.map(_.asJava).orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .`type`(`type`.orNull)
      .build()
}
