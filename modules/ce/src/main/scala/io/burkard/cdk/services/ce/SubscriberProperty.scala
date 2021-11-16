package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriberProperty {

  def apply(
    address: String,
    `type`: String,
    status: Option[String] = None
  ): software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty =
    (new software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty.Builder)
      .address(address)
      .`type`(`type`)
      .status(status.orNull)
      .build()
}
