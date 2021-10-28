package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFunction {

  def apply(
    internalResourceId: String,
    autoPublishCodeSha256: Option[String] = None,
    provisionedConcurrencyConfig: Option[software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty] = None,
    layers: Option[List[String]] = None,
    functionName: Option[String] = None,
    role: Option[String] = None,
    vpcConfig: Option[software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty] = None,
    fileSystemConfigs: Option[List[_]] = None,
    eventInvokeConfig: Option[software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty] = None,
    packageType: Option[String] = None,
    codeUri0: Option[software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty] = None,
    codeUri1: Option[String] = None,
    environment: Option[software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty] = None,
    codeSigningConfigArn: Option[String] = None,
    imageConfig: Option[software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty] = None,
    timeout: Option[Number] = None,
    handler: Option[String] = None,
    policies0: Option[software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty] = None,
    policies1: Option[List[_]] = None,
    policies2: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    permissionsBoundary: Option[String] = None,
    description: Option[String] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty] = None,
    deploymentPreference: Option[software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty] = None,
    imageUri: Option[String] = None,
    assumeRolePolicyDocument: Option[AnyRef] = None,
    memorySize: Option[Number] = None,
    kmsKeyArn: Option[String] = None,
    inlineCode: Option[String] = None,
    autoPublishAlias: Option[String] = None,
    reservedConcurrentExecutions: Option[Number] = None,
    versionDescription: Option[String] = None,
    tracing: Option[String] = None,
    events: Option[Map[String, _]] = None,
    runtime: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sam.CfnFunction =
    software.amazon.awscdk.services.sam.CfnFunction.Builder
      .create(stackCtx, internalResourceId)
      .autoPublishCodeSha256(autoPublishCodeSha256.orNull)
      .provisionedConcurrencyConfig(provisionedConcurrencyConfig.orNull)
      .layers(layers.map(_.asJava).orNull)
      .functionName(functionName.orNull)
      .role(role.orNull)
      .vpcConfig(vpcConfig.orNull)
      .fileSystemConfigs(fileSystemConfigs.map(_.asJava).orNull)
      .eventInvokeConfig(eventInvokeConfig.orNull)
      .packageType(packageType.orNull)
      .codeUri(codeUri0.orNull)
      .codeUri(codeUri1.orNull)
      .environment(environment.orNull)
      .codeSigningConfigArn(codeSigningConfigArn.orNull)
      .imageConfig(imageConfig.orNull)
      .timeout(timeout.orNull)
      .handler(handler.orNull)
      .policies(policies0.orNull)
      .policies(policies1.map(_.asJava).orNull)
      .policies(policies2.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissionsBoundary(permissionsBoundary.orNull)
      .description(description.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .deploymentPreference(deploymentPreference.orNull)
      .imageUri(imageUri.orNull)
      .assumeRolePolicyDocument(assumeRolePolicyDocument.orNull)
      .memorySize(memorySize.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .inlineCode(inlineCode.orNull)
      .autoPublishAlias(autoPublishAlias.orNull)
      .reservedConcurrentExecutions(reservedConcurrentExecutions.orNull)
      .versionDescription(versionDescription.orNull)
      .tracing(tracing.orNull)
      .events(events.map(_.asJava).orNull)
      .runtime(runtime.orNull)
      .build()
}
