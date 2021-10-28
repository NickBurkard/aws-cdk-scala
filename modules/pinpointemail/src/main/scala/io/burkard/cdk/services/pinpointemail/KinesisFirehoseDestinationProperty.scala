package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisFirehoseDestinationProperty {

  def apply(
    deliveryStreamArn: Option[String] = None,
    iamRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder)
      .deliveryStreamArn(deliveryStreamArn.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .build()
}
