package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HiveJsonSerDeProperty {

  def apply(
    timestampFormats: Option[List[String]] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty.Builder)
      .timestampFormats(timestampFormats.map(_.asJava).orNull)
      .build()
}
