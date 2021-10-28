package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ShellScriptAction {

  def apply(
    bashOptions: Option[String] = None,
    rolePolicyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    additionalArtifacts: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    actionName: Option[String] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    commands: Option[List[String]] = None,
    runOrder: Option[Number] = None,
    environment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    useOutputs: Option[Map[String, _ <: software.amazon.awscdk.pipelines.StackOutput]] = None
  ): software.amazon.awscdk.pipelines.ShellScriptAction =
    software.amazon.awscdk.pipelines.ShellScriptAction.Builder
      .create()
      .bashOptions(bashOptions.orNull)
      .rolePolicyStatements(rolePolicyStatements.map(_.asJava).orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .additionalArtifacts(additionalArtifacts.map(_.asJava).orNull)
      .subnetSelection(subnetSelection.orNull)
      .actionName(actionName.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .commands(commands.map(_.asJava).orNull)
      .runOrder(runOrder.orNull)
      .environment(environment.orNull)
      .useOutputs(useOutputs.map(_.asJava).orNull)
      .build()
}
