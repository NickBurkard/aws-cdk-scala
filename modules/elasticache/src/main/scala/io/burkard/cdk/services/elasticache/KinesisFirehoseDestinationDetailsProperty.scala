package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseDestinationDetailsProperty {

  def apply(
    deliveryStream: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty =
    (new software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.Builder)
      .deliveryStream(deliveryStream.orNull)
      .build()
}
