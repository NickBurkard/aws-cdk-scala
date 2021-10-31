package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PipelineProject {

  def apply(
    internalResourceId: String,
    projectName: Option[String] = None,
    logging: Option[software.amazon.awscdk.services.codebuild.LoggingOptions] = None,
    description: Option[String] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cache: Option[software.amazon.awscdk.services.codebuild.Cache] = None,
    allowAllOutbound: Option[Boolean] = None,
    concurrentBuildLimit: Option[Number] = None,
    environment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    fileSystemLocations: Option[List[_ <: software.amazon.awscdk.services.codebuild.IFileSystemLocation]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    grantReportGroupPermissions: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    badge: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    checkSecretsInPlainTextEnvVariables: Option[Boolean] = None,
    queuedTimeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.PipelineProject =
    software.amazon.awscdk.services.codebuild.PipelineProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName.orNull)
      .logging(logging.orNull)
      .description(description.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .buildSpec(buildSpec.orNull)
      .subnetSelection(subnetSelection.orNull)
      .cache(cache.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .concurrentBuildLimit(concurrentBuildLimit.orNull)
      .environment(environment.orNull)
      .fileSystemLocations(fileSystemLocations.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .grantReportGroupPermissions(grantReportGroupPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .badge(badge.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .encryptionKey(encryptionKey.orNull)
      .checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .queuedTimeout(queuedTimeout.orNull)
      .build()
}
