package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublishAssetsActionProps {

  def apply(
    actionName: String,
    assetType: software.amazon.awscdk.pipelines.AssetType,
    cloudAssemblyInput: software.amazon.awscdk.services.codepipeline.Artifact,
    dependable: Option[software.constructs.IDependable] = None,
    projectName: Option[String] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    createBuildspecFile: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    preInstallCommands: Option[List[String]] = None,
    cdkCliVersion: Option[String] = None
  ): software.amazon.awscdk.pipelines.PublishAssetsActionProps =
    (new software.amazon.awscdk.pipelines.PublishAssetsActionProps.Builder)
      .actionName(actionName)
      .assetType(assetType)
      .cloudAssemblyInput(cloudAssemblyInput)
      .dependable(dependable.orNull)
      .projectName(projectName.orNull)
      .subnetSelection(subnetSelection.orNull)
      .createBuildspecFile(createBuildspecFile.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .role(role.orNull)
      .buildSpec(buildSpec.orNull)
      .preInstallCommands(preInstallCommands.map(_.asJava).orNull)
      .cdkCliVersion(cdkCliVersion.orNull)
      .build()
}
