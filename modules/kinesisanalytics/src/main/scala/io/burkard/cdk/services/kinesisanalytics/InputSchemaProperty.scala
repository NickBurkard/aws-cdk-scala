package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputSchemaProperty {

  def apply(
    recordColumns: Option[List[_]] = None,
    recordEncoding: Option[String] = None,
    recordFormat: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder)
      .recordColumns(recordColumns.map(_.asJava).orNull)
      .recordEncoding(recordEncoding.orNull)
      .recordFormat(recordFormat.orNull)
      .build()
}
