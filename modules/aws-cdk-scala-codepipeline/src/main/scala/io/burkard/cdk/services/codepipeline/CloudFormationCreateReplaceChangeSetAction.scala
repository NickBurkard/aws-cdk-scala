package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudFormationCreateReplaceChangeSetAction {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    region: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    changeSetName: Option[String] = None,
    parameterOverrides: Option[Map[String, _]] = None,
    templatePath: Option[software.amazon.awscdk.services.codepipeline.ArtifactPath] = None,
    cfnCapabilities: Option[List[_ <: software.amazon.awscdk.CfnCapabilities]] = None,
    templateConfiguration: Option[software.amazon.awscdk.services.codepipeline.ArtifactPath] = None,
    adminPermissions: Option[Boolean] = None,
    outputFileName: Option[String] = None,
    extraInputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    stackName: Option[String] = None,
    account: Option[String] = None,
    deploymentRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction =
    software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction.Builder
      .create()
      .role(role.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .region(region.orNull)
      .output(output.orNull)
      .changeSetName(changeSetName.orNull)
      .parameterOverrides(parameterOverrides.map(_.asJava).orNull)
      .templatePath(templatePath.orNull)
      .cfnCapabilities(cfnCapabilities.map(_.asJava).orNull)
      .templateConfiguration(templateConfiguration.orNull)
      .adminPermissions(adminPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .outputFileName(outputFileName.orNull)
      .extraInputs(extraInputs.map(_.asJava).orNull)
      .stackName(stackName.orNull)
      .account(account.orNull)
      .deploymentRole(deploymentRole.orNull)
      .build()
}
