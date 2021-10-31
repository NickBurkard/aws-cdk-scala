package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrackerConsumerProps {

  def apply(
    consumerArn: Option[String] = None,
    trackerName: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnTrackerConsumerProps =
    (new software.amazon.awscdk.services.location.CfnTrackerConsumerProps.Builder)
      .consumerArn(consumerArn.orNull)
      .trackerName(trackerName.orNull)
      .build()
}
