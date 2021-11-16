package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublishAssetsAction {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.pipelines.PublishAssetsAction =
    software.amazon.awscdk.pipelines.PublishAssetsAction.Builder
      .create(stackCtx, internalResourceId)
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
