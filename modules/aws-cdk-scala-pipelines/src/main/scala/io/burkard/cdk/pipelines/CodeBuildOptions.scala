package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeBuildOptions {

  def apply(
    rolePolicy: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    buildEnvironment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    partialBuildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None
  ): software.amazon.awscdk.pipelines.CodeBuildOptions =
    (new software.amazon.awscdk.pipelines.CodeBuildOptions.Builder)
      .rolePolicy(rolePolicy.map(_.asJava).orNull)
      .subnetSelection(subnetSelection.orNull)
      .buildEnvironment(buildEnvironment.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .partialBuildSpec(partialBuildSpec.orNull)
      .build()
}
