package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ShellScriptActionProps {

  def apply(
    actionName: String,
    commands: List[String],
    bashOptions: Option[String] = None,
    rolePolicyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    additionalArtifacts: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    runOrder: Option[Number] = None,
    environment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    useOutputs: Option[Map[String, _ <: software.amazon.awscdk.pipelines.StackOutput]] = None
  ): software.amazon.awscdk.pipelines.ShellScriptActionProps =
    (new software.amazon.awscdk.pipelines.ShellScriptActionProps.Builder)
      .actionName(actionName)
      .commands(commands.asJava)
      .bashOptions(bashOptions.orNull)
      .rolePolicyStatements(rolePolicyStatements.map(_.asJava).orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .additionalArtifacts(additionalArtifacts.map(_.asJava).orNull)
      .subnetSelection(subnetSelection.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .runOrder(runOrder.orNull)
      .environment(environment.orNull)
      .useOutputs(useOutputs.map(_.asJava).orNull)
      .build()
}
