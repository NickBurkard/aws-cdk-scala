package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrackerConsumer {

  def apply(
    internalResourceId: String,
    consumerArn: Option[String] = None,
    trackerName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnTrackerConsumer =
    software.amazon.awscdk.services.location.CfnTrackerConsumer.Builder
      .create(stackCtx, internalResourceId)
      .consumerArn(consumerArn.orNull)
      .trackerName(trackerName.orNull)
      .build()
}
