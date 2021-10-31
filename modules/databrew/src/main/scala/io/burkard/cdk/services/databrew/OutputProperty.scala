package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutputProperty {

  def apply(
    format: Option[String] = None,
    location: Option[software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty] = None,
    formatOptions: Option[software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty] = None,
    partitionColumns: Option[List[String]] = None,
    compressionFormat: Option[String] = None,
    overwrite: Option[Boolean] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.OutputProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.OutputProperty.Builder)
      .format(format.orNull)
      .location(location.orNull)
      .formatOptions(formatOptions.orNull)
      .partitionColumns(partitionColumns.map(_.asJava).orNull)
      .compressionFormat(compressionFormat.orNull)
      .overwrite(overwrite.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
