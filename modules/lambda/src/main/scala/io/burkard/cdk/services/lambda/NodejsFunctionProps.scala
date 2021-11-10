package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NodejsFunctionProps {

  def apply(
    initialPolicy: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    layers: Option[List[_ <: software.amazon.awscdk.services.lambda.ILayerVersion]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    description: Option[String] = None,
    profilingGroup: Option[software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup] = None,
    memorySize: Option[Number] = None,
    profiling: Option[Boolean] = None,
    onSuccess: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    currentVersionOptions: Option[software.amazon.awscdk.services.lambda.VersionOptions] = None,
    environment: Option[Map[String, String]] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    deadLetterQueueEnabled: Option[Boolean] = None,
    codeSigningConfig: Option[software.amazon.awscdk.services.lambda.ICodeSigningConfig] = None,
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    functionName: Option[String] = None,
    filesystem: Option[software.amazon.awscdk.services.lambda.FileSystem] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    environmentEncryption: Option[software.amazon.awscdk.services.kms.IKey] = None,
    entry: Option[String] = None,
    allowPublicSubnet: Option[Boolean] = None,
    architecture: Option[software.amazon.awscdk.services.lambda.Architecture] = None,
    projectRoot: Option[String] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    insightsVersion: Option[software.amazon.awscdk.services.lambda.LambdaInsightsVersion] = None,
    bundling: Option[software.amazon.awscdk.services.lambda.nodejs.BundlingOptions] = None,
    allowAllOutbound: Option[Boolean] = None,
    reservedConcurrentExecutions: Option[Number] = None,
    retryAttempts: Option[Number] = None,
    tracing: Option[software.amazon.awscdk.services.lambda.Tracing] = None,
    depsLockFilePath: Option[String] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IDestination] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.lambda.LogRetentionRetryOptions] = None,
    logRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    handler: Option[String] = None,
    awsSdkConnectionReuse: Option[Boolean] = None,
    events: Option[List[_ <: software.amazon.awscdk.services.lambda.IEventSource]] = None,
    runtime: Option[software.amazon.awscdk.services.lambda.Runtime] = None,
    architectures: Option[List[_ <: software.amazon.awscdk.services.lambda.Architecture]] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps =
    (new software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps.Builder)
      .initialPolicy(initialPolicy.map(_.asJava).orNull)
      .layers(layers.map(_.asJava).orNull)
      .role(role.orNull)
      .description(description.orNull)
      .profilingGroup(profilingGroup.orNull)
      .memorySize(memorySize.orNull)
      .profiling(profiling.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .onSuccess(onSuccess.orNull)
      .currentVersionOptions(currentVersionOptions.orNull)
      .environment(environment.map(_.asJava).orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .deadLetterQueueEnabled(deadLetterQueueEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .codeSigningConfig(codeSigningConfig.orNull)
      .logRetention(logRetention.orNull)
      .maxEventAge(maxEventAge.orNull)
      .functionName(functionName.orNull)
      .filesystem(filesystem.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .environmentEncryption(environmentEncryption.orNull)
      .entry(entry.orNull)
      .allowPublicSubnet(allowPublicSubnet.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .architecture(architecture.orNull)
      .projectRoot(projectRoot.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .insightsVersion(insightsVersion.orNull)
      .bundling(bundling.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .reservedConcurrentExecutions(reservedConcurrentExecutions.orNull)
      .retryAttempts(retryAttempts.orNull)
      .tracing(tracing.orNull)
      .depsLockFilePath(depsLockFilePath.orNull)
      .onFailure(onFailure.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .logRetentionRole(logRetentionRole.orNull)
      .timeout(timeout.orNull)
      .handler(handler.orNull)
      .awsSdkConnectionReuse(awsSdkConnectionReuse.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .events(events.map(_.asJava).orNull)
      .runtime(runtime.orNull)
      .architectures(architectures.map(_.asJava).orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
