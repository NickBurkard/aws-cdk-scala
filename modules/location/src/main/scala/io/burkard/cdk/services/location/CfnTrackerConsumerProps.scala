package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrackerConsumerProps {

  def apply(
    consumerArn: String,
    trackerName: String
  ): software.amazon.awscdk.services.location.CfnTrackerConsumerProps =
    (new software.amazon.awscdk.services.location.CfnTrackerConsumerProps.Builder)
      .consumerArn(consumerArn)
      .trackerName(trackerName)
      .build()
}
