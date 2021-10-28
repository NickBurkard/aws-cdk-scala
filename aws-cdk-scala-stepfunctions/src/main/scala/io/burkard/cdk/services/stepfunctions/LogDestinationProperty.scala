package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogDestinationProperty {

  def apply(
    cloudWatchLogsLogGroup: Option[software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty] = None
  ): software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty =
    (new software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty.Builder)
      .cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.orNull)
      .build()
}
