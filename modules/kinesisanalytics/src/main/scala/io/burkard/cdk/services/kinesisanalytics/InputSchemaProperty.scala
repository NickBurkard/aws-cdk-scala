package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputSchemaProperty {

  def apply(
    recordColumns: List[_],
    recordFormat: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty,
    recordEncoding: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder)
      .recordColumns(recordColumns.asJava)
      .recordFormat(recordFormat)
      .recordEncoding(recordEncoding.orNull)
      .build()
}
