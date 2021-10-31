package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OrcSerDeProperty {

  def apply(
    enablePadding: Option[Boolean] = None,
    compression: Option[String] = None,
    paddingTolerance: Option[Number] = None,
    bloomFilterColumns: Option[List[String]] = None,
    stripeSizeBytes: Option[Number] = None,
    dictionaryKeyThreshold: Option[Number] = None,
    blockSizeBytes: Option[Number] = None,
    rowIndexStride: Option[Number] = None,
    formatVersion: Option[String] = None,
    bloomFilterFalsePositiveProbability: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty.Builder)
      .enablePadding(enablePadding.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .compression(compression.orNull)
      .paddingTolerance(paddingTolerance.orNull)
      .bloomFilterColumns(bloomFilterColumns.map(_.asJava).orNull)
      .stripeSizeBytes(stripeSizeBytes.orNull)
      .dictionaryKeyThreshold(dictionaryKeyThreshold.orNull)
      .blockSizeBytes(blockSizeBytes.orNull)
      .rowIndexStride(rowIndexStride.orNull)
      .formatVersion(formatVersion.orNull)
      .bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability.orNull)
      .build()
}
