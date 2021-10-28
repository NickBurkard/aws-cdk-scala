package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublishAssetsActionProps {

  def apply(
    dependable: Option[software.constructs.IDependable] = None,
    projectName: Option[String] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    createBuildspecFile: Option[Boolean] = None,
    actionName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    assetType: Option[software.amazon.awscdk.pipelines.AssetType] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    preInstallCommands: Option[List[String]] = None,
    cloudAssemblyInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    cdkCliVersion: Option[String] = None
  ): software.amazon.awscdk.pipelines.PublishAssetsActionProps =
    (new software.amazon.awscdk.pipelines.PublishAssetsActionProps.Builder)
      .dependable(dependable.orNull)
      .projectName(projectName.orNull)
      .subnetSelection(subnetSelection.orNull)
      .createBuildspecFile(createBuildspecFile.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .actionName(actionName.orNull)
      .vpc(vpc.orNull)
      .assetType(assetType.orNull)
      .role(role.orNull)
      .buildSpec(buildSpec.orNull)
      .preInstallCommands(preInstallCommands.map(_.asJava).orNull)
      .cloudAssemblyInput(cloudAssemblyInput.orNull)
      .cdkCliVersion(cdkCliVersion.orNull)
      .build()
}
