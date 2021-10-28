package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Project {

  def apply(
    internalResourceId: String,
    artifacts: Option[software.amazon.awscdk.services.codebuild.IArtifacts] = None,
    projectName: Option[String] = None,
    description: Option[String] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cache: Option[software.amazon.awscdk.services.codebuild.Cache] = None,
    allowAllOutbound: Option[Boolean] = None,
    concurrentBuildLimit: Option[Number] = None,
    environment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    fileSystemLocations: Option[List[_ <: software.amazon.awscdk.services.codebuild.IFileSystemLocation]] = None,
    source: Option[software.amazon.awscdk.services.codebuild.ISource] = None,
    logging: Option[software.amazon.awscdk.services.codebuild.LoggingOptions] = None,
    grantReportGroupPermissions: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    badge: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    secondarySources: Option[List[_ <: software.amazon.awscdk.services.codebuild.ISource]] = None,
    secondaryArtifacts: Option[List[_ <: software.amazon.awscdk.services.codebuild.IArtifacts]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    checkSecretsInPlainTextEnvVariables: Option[Boolean] = None,
    queuedTimeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.Project =
    software.amazon.awscdk.services.codebuild.Project.Builder
      .create(stackCtx, internalResourceId)
      .artifacts(artifacts.orNull)
      .projectName(projectName.orNull)
      .description(description.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .buildSpec(buildSpec.orNull)
      .subnetSelection(subnetSelection.orNull)
      .cache(cache.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .concurrentBuildLimit(concurrentBuildLimit.orNull)
      .environment(environment.orNull)
      .fileSystemLocations(fileSystemLocations.map(_.asJava).orNull)
      .source(source.orNull)
      .logging(logging.orNull)
      .grantReportGroupPermissions(grantReportGroupPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .badge(badge.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .secondarySources(secondarySources.map(_.asJava).orNull)
      .secondaryArtifacts(secondaryArtifacts.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .timeout(timeout.orNull)
      .encryptionKey(encryptionKey.orNull)
      .checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .queuedTimeout(queuedTimeout.orNull)
      .build()
}
