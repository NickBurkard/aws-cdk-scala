package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JenkinsActionProps {

  def apply(
    projectName: Option[String] = None,
    jenkinsProvider: Option[software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider] = None,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    inputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType] = None
  ): software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps.Builder)
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
