package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudFormationExecuteChangeSetAction {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    outputFileName: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    region: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    changeSetName: Option[String] = None,
    stackName: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction =
    software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction.Builder
      .create()
      .role(role.orNull)
      .outputFileName(outputFileName.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .region(region.orNull)
      .output(output.orNull)
      .changeSetName(changeSetName.orNull)
      .stackName(stackName.orNull)
      .account(account.orNull)
      .build()
}
