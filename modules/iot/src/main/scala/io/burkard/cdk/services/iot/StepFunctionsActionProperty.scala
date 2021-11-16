package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepFunctionsActionProperty {

  def apply(
    roleArn: String,
    stateMachineName: String,
    executionNamePrefix: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder)
      .roleArn(roleArn)
      .stateMachineName(stateMachineName)
      .executionNamePrefix(executionNamePrefix.orNull)
      .build()
}
