package io.burkard.cdk.services.kinesisfirehose

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HiveJsonSerDeProperty {

  def apply(
    timestampFormats: Option[List[String]] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty.Builder)
      .timestampFormats(timestampFormats.map(_.asJava).orNull)
      .build()
}
