package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StorageDescriptorProperty {

  def apply(
    numberOfBuckets: Option[Number] = None,
    location: Option[String] = None,
    bucketColumns: Option[List[String]] = None,
    schemaReference: Option[software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty] = None,
    skewedInfo: Option[software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty] = None,
    serdeInfo: Option[software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty] = None,
    sortColumns: Option[List[_]] = None,
    inputFormat: Option[String] = None,
    parameters: Option[AnyRef] = None,
    storedAsSubDirectories: Option[Boolean] = None,
    outputFormat: Option[String] = None,
    compressed: Option[Boolean] = None,
    columns: Option[List[_]] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty.Builder)
      .numberOfBuckets(numberOfBuckets.orNull)
      .location(location.orNull)
      .bucketColumns(bucketColumns.map(_.asJava).orNull)
      .schemaReference(schemaReference.orNull)
      .skewedInfo(skewedInfo.orNull)
      .serdeInfo(serdeInfo.orNull)
      .sortColumns(sortColumns.map(_.asJava).orNull)
      .inputFormat(inputFormat.orNull)
      .parameters(parameters.orNull)
      .storedAsSubDirectories(storedAsSubDirectories.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .outputFormat(outputFormat.orNull)
      .compressed(compressed.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .columns(columns.map(_.asJava).orNull)
      .build()
}
