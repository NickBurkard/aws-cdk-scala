package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SimpleSynthActionProps {

  def apply(
    synthCommand: Option[String] = None,
    projectName: Option[String] = None,
    rolePolicyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    testCommands: Option[List[String]] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    sourceArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    copyEnvironmentVariables: Option[List[String]] = None,
    environment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    actionName: Option[String] = None,
    cloudAssemblyArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    additionalArtifacts: Option[List[_ <: software.amazon.awscdk.pipelines.AdditionalArtifact]] = None,
    installCommands: Option[List[String]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    subdirectory: Option[String] = None,
    buildCommands: Option[List[String]] = None
  ): software.amazon.awscdk.pipelines.SimpleSynthActionProps =
    (new software.amazon.awscdk.pipelines.SimpleSynthActionProps.Builder)
      .synthCommand(synthCommand.orNull)
      .projectName(projectName.orNull)
      .rolePolicyStatements(rolePolicyStatements.map(_.asJava).orNull)
      .testCommands(testCommands.map(_.asJava).orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .buildSpec(buildSpec.orNull)
      .subnetSelection(subnetSelection.orNull)
      .sourceArtifact(sourceArtifact.orNull)
      .copyEnvironmentVariables(copyEnvironmentVariables.map(_.asJava).orNull)
      .environment(environment.orNull)
      .actionName(actionName.orNull)
      .cloudAssemblyArtifact(cloudAssemblyArtifact.orNull)
      .additionalArtifacts(additionalArtifacts.map(_.asJava).orNull)
      .installCommands(installCommands.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .subdirectory(subdirectory.orNull)
      .buildCommands(buildCommands.map(_.asJava).orNull)
      .build()
}
