package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeDeployEcsDeployActionProps {

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
  ): software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps.Builder)
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
