package io.burkard.cdk.services.kinesisanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputSchemaProperty {

  def apply(
    recordColumns: Option[List[_]] = None,
    recordEncoding: Option[String] = None,
    recordFormat: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder)
      .recordColumns(recordColumns.map(_.asJava).orNull)
      .recordEncoding(recordEncoding.orNull)
      .recordFormat(recordFormat.orNull)
      .build()
}
