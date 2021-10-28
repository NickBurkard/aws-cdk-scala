package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleTargetConfig {

  def apply(
    ecsParameters: Option[software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    httpParameters: Option[software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty] = None,
    batchParameters: Option[software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty] = None,
    sqsParameters: Option[software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty] = None,
    input: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterConfig: Option[software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty] = None,
    arn: Option[String] = None,
    runCommandParameters: Option[software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty] = None,
    targetResource: Option[software.constructs.IConstruct] = None,
    kinesisParameters: Option[software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty] = None,
    retryPolicy: Option[software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty] = None
  ): software.amazon.awscdk.services.events.RuleTargetConfig =
    (new software.amazon.awscdk.services.events.RuleTargetConfig.Builder)
      .ecsParameters(ecsParameters.orNull)
      .role(role.orNull)
      .httpParameters(httpParameters.orNull)
      .batchParameters(batchParameters.orNull)
      .sqsParameters(sqsParameters.orNull)
      .input(input.orNull)
      .deadLetterConfig(deadLetterConfig.orNull)
      .arn(arn.orNull)
      .runCommandParameters(runCommandParameters.orNull)
      .targetResource(targetResource.orNull)
      .kinesisParameters(kinesisParameters.orNull)
      .retryPolicy(retryPolicy.orNull)
      .build()
}
