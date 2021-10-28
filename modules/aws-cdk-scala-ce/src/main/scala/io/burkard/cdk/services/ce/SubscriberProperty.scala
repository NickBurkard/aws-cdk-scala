package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubscriberProperty {

  def apply(
    status: Option[String] = None,
    address: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty =
    (new software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty.Builder)
      .status(status.orNull)
      .address(address.orNull)
      .`type`(`type`.orNull)
      .build()
}
