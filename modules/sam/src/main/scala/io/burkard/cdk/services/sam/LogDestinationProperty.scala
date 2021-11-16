package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogDestinationProperty {

  def apply(
    cloudWatchLogsLogGroup: software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty
  ): software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty.Builder)
      .cloudWatchLogsLogGroup(cloudWatchLogsLogGroup)
      .build()
}
