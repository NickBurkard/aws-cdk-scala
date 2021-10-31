package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeDeployEcsDeployAction {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    appSpecTemplateInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    variablesNamespace: Option[String] = None,
    appSpecTemplateFile: Option[software.amazon.awscdk.services.codepipeline.ArtifactPath] = None,
    deploymentGroup: Option[software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup] = None,
    actionName: Option[String] = None,
    runOrder: Option[Number] = None,
    taskDefinitionTemplateFile: Option[software.amazon.awscdk.services.codepipeline.ArtifactPath] = None,
    containerImageInputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput]] = None,
    taskDefinitionTemplateInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction =
    software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction.Builder
      .create()
      .role(role.orNull)
      .appSpecTemplateInput(appSpecTemplateInput.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .appSpecTemplateFile(appSpecTemplateFile.orNull)
      .deploymentGroup(deploymentGroup.orNull)
      .actionName(actionName.orNull)
      .runOrder(runOrder.orNull)
      .taskDefinitionTemplateFile(taskDefinitionTemplateFile.orNull)
      .containerImageInputs(containerImageInputs.map(_.asJava).orNull)
      .taskDefinitionTemplateInput(taskDefinitionTemplateInput.orNull)
      .build()
}
