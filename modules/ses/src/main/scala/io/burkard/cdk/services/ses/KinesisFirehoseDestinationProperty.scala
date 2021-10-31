package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseDestinationProperty {

  def apply(
    deliveryStreamArn: Option[String] = None,
    iamRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder)
      .deliveryStreamArn(deliveryStreamArn.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .build()
}
