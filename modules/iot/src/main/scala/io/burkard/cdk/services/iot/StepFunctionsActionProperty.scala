package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepFunctionsActionProperty {

  def apply(
    executionNamePrefix: Option[String] = None,
    roleArn: Option[String] = None,
    stateMachineName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder)
      .executionNamePrefix(executionNamePrefix.orNull)
      .roleArn(roleArn.orNull)
      .stateMachineName(stateMachineName.orNull)
      .build()
}
