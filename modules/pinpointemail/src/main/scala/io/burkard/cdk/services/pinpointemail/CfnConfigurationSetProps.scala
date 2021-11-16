package io.burkard.cdk.services.pinpointemail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetProps {

  def apply(
    name: String,
    tags: Option[List[_ <: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TagsProperty]] = None,
    reputationOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty] = None,
    trackingOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty] = None,
    sendingOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty] = None,
    deliveryOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps.Builder)
      .name(name)
      .tags(tags.map(_.asJava).orNull)
      .reputationOptions(reputationOptions.orNull)
      .trackingOptions(trackingOptions.orNull)
      .sendingOptions(sendingOptions.orNull)
      .deliveryOptions(deliveryOptions.orNull)
      .build()
}
