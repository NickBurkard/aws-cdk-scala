package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeDeployServerDeployAction {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    variablesNamespace: Option[String] = None,
    deploymentGroup: Option[software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    input: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction =
    software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction.Builder
      .create()
      .role(role.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .deploymentGroup(deploymentGroup.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .input(input.orNull)
      .build()
}
