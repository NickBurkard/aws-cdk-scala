package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReferenceSchemaProperty {

  def apply(
    recordColumns: List[_],
    recordFormat: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty,
    recordEncoding: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder)
      .recordColumns(recordColumns.asJava)
      .recordFormat(recordFormat)
      .recordEncoding(recordEncoding.orNull)
      .build()
}
