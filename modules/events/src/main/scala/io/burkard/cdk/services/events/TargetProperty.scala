package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetProperty {

  def apply(
    ecsParameters: Option[software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty] = None,
    runCommandParameters: Option[software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty] = None,
    inputTransformer: Option[software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty] = None,
    httpParameters: Option[software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty] = None,
    batchParameters: Option[software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty] = None,
    redshiftDataParameters: Option[software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty] = None,
    id: Option[String] = None,
    inputPath: Option[String] = None,
    input: Option[String] = None,
    deadLetterConfig: Option[software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty] = None,
    arn: Option[String] = None,
    roleArn: Option[String] = None,
    sqsParameters: Option[software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty] = None,
    kinesisParameters: Option[software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty] = None,
    retryPolicy: Option[software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty] = None
  ): software.amazon.awscdk.services.events.CfnRule.TargetProperty =
    (new software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder)
      .ecsParameters(ecsParameters.orNull)
      .runCommandParameters(runCommandParameters.orNull)
      .inputTransformer(inputTransformer.orNull)
      .httpParameters(httpParameters.orNull)
      .batchParameters(batchParameters.orNull)
      .redshiftDataParameters(redshiftDataParameters.orNull)
      .id(id.orNull)
      .inputPath(inputPath.orNull)
      .input(input.orNull)
      .deadLetterConfig(deadLetterConfig.orNull)
      .arn(arn.orNull)
      .roleArn(roleArn.orNull)
      .sqsParameters(sqsParameters.orNull)
      .kinesisParameters(kinesisParameters.orNull)
      .retryPolicy(retryPolicy.orNull)
      .build()
}
