package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseDestinationDetailsProperty {

  def apply(
    deliveryStream: String
  ): software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty =
    (new software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.Builder)
      .deliveryStream(deliveryStream)
      .build()
}
