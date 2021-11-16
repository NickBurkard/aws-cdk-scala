package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudFormationExecuteChangeSetActionProps {

  def apply(
    changeSetName: String,
    stackName: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    outputFileName: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    region: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps.Builder)
      .changeSetName(changeSetName)
      .stackName(stackName)
      .role(role.orNull)
      .outputFileName(outputFileName.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .region(region.orNull)
      .output(output.orNull)
      .account(account.orNull)
      .build()
}
