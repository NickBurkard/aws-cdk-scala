package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeDeployServerDeployAction {

  def apply(
    deploymentGroup: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup,
    input: software.amazon.awscdk.services.codepipeline.Artifact,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction =
    software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction.Builder
      .create()
      .deploymentGroup(deploymentGroup)
      .input(input)
      .role(role.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .build()
}
