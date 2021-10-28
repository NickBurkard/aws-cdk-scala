package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchLogsLogGroupProperty {

  def apply(
    logGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder)
      .logGroupArn(logGroupArn.orNull)
      .build()
}
