package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OpenXJsonSerDeProperty {

  def apply(
    caseInsensitive: Option[Boolean] = None,
    columnToJsonKeyMappings: Option[Map[String, String]] = None,
    convertDotsInJsonKeysToUnderscores: Option[Boolean] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty.Builder)
      .caseInsensitive(caseInsensitive.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .columnToJsonKeyMappings(columnToJsonKeyMappings.map(_.asJava).orNull)
      .convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
