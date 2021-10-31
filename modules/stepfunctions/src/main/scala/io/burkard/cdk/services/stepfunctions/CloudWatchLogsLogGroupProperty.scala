package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLogsLogGroupProperty {

  def apply(
    logGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty =
    (new software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder)
      .logGroupArn(logGroupArn.orNull)
      .build()
}
