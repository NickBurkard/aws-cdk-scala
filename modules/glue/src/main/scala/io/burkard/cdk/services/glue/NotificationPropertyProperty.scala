package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationPropertyProperty {

  def apply(
    notifyDelayAfter: Option[Number] = None
  ): software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty =
    (new software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty.Builder)
      .notifyDelayAfter(notifyDelayAfter.orNull)
      .build()
}
