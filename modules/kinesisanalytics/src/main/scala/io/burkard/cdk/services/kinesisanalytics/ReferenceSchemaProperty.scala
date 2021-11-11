package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReferenceSchemaProperty {

  def apply(
    recordColumns: Option[List[_]] = None,
    recordEncoding: Option[String] = None,
    recordFormat: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder)
      .recordColumns(recordColumns.map(_.asJava).orNull)
      .recordEncoding(recordEncoding.orNull)
      .recordFormat(recordFormat.orNull)
      .build()
}
