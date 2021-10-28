package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeBuildStep {

  def apply(
    id: String,
    projectName: Option[String] = None,
    additionalInputs: Option[Map[String, _ <: software.amazon.awscdk.pipelines.IFileSetProducer]] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    envFromCfnOutputs: Option[Map[String, _ <: software.amazon.awscdk.CfnOutput]] = None,
    commands: Option[List[String]] = None,
    input: Option[software.amazon.awscdk.pipelines.IFileSetProducer] = None,
    rolePolicyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    buildEnvironment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    primaryOutputDirectory: Option[String] = None,
    installCommands: Option[List[String]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    partialBuildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    env: Option[Map[String, String]] = None
  ): software.amazon.awscdk.pipelines.CodeBuildStep =
    software.amazon.awscdk.pipelines.CodeBuildStep.Builder
      .create(id)
      .projectName(projectName.orNull)
      .additionalInputs(additionalInputs.map(_.asJava).orNull)
      .subnetSelection(subnetSelection.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .envFromCfnOutputs(envFromCfnOutputs.map(_.asJava).orNull)
      .commands(commands.map(_.asJava).orNull)
      .input(input.orNull)
      .rolePolicyStatements(rolePolicyStatements.map(_.asJava).orNull)
      .role(role.orNull)
      .buildEnvironment(buildEnvironment.orNull)
      .primaryOutputDirectory(primaryOutputDirectory.orNull)
      .installCommands(installCommands.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .partialBuildSpec(partialBuildSpec.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
