package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JenkinsActionProps {

  def apply(
    projectName: String,
    jenkinsProvider: software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider,
    `type`: software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    inputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps.Builder)
      .projectName(projectName)
      .jenkinsProvider(jenkinsProvider)
      .`type`(`type`)
      .outputs(outputs.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .inputs(inputs.map(_.asJava).orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .build()
}
