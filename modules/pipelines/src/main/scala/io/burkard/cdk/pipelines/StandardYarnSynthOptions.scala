package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StandardYarnSynthOptions {

  def apply(
    synthCommand: Option[String] = None,
    projectName: Option[String] = None,
    rolePolicyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    sourceArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    copyEnvironmentVariables: Option[List[String]] = None,
    environment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    actionName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    subdirectory: Option[String] = None,
    testCommands: Option[List[String]] = None,
    installCommand: Option[String] = None,
    cloudAssemblyArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    additionalArtifacts: Option[List[_ <: software.amazon.awscdk.pipelines.AdditionalArtifact]] = None,
    buildCommand: Option[String] = None
  ): software.amazon.awscdk.pipelines.StandardYarnSynthOptions =
    (new software.amazon.awscdk.pipelines.StandardYarnSynthOptions.Builder)
      .synthCommand(synthCommand.orNull)
      .projectName(projectName.orNull)
      .rolePolicyStatements(rolePolicyStatements.map(_.asJava).orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .buildSpec(buildSpec.orNull)
      .subnetSelection(subnetSelection.orNull)
      .sourceArtifact(sourceArtifact.orNull)
      .copyEnvironmentVariables(copyEnvironmentVariables.map(_.asJava).orNull)
      .environment(environment.orNull)
      .actionName(actionName.orNull)
      .vpc(vpc.orNull)
      .subdirectory(subdirectory.orNull)
      .testCommands(testCommands.map(_.asJava).orNull)
      .installCommand(installCommand.orNull)
      .cloudAssemblyArtifact(cloudAssemblyArtifact.orNull)
      .additionalArtifacts(additionalArtifacts.map(_.asJava).orNull)
      .buildCommand(buildCommand.orNull)
      .build()
}
