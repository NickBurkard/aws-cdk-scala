package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputSchemaProperty {

  def apply(
    recordColumns: List[_],
    recordFormat: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty,
    recordEncoding: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder)
      .recordColumns(recordColumns.asJava)
      .recordFormat(recordFormat)
      .recordEncoding(recordEncoding.orNull)
      .build()
}
