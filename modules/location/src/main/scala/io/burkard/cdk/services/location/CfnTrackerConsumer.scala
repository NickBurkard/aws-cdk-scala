package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrackerConsumer {

  def apply(
    internalResourceId: String,
    consumerArn: String,
    trackerName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnTrackerConsumer =
    software.amazon.awscdk.services.location.CfnTrackerConsumer.Builder
      .create(stackCtx, internalResourceId)
      .consumerArn(consumerArn)
      .trackerName(trackerName)
      .build()
}
