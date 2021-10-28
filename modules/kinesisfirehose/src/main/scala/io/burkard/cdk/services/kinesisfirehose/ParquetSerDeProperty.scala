package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParquetSerDeProperty {

  def apply(
    writerVersion: Option[String] = None,
    compression: Option[String] = None,
    pageSizeBytes: Option[Number] = None,
    maxPaddingBytes: Option[Number] = None,
    blockSizeBytes: Option[Number] = None,
    enableDictionaryCompression: Option[Boolean] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty.Builder)
      .writerVersion(writerVersion.orNull)
      .compression(compression.orNull)
      .pageSizeBytes(pageSizeBytes.orNull)
      .maxPaddingBytes(maxPaddingBytes.orNull)
      .blockSizeBytes(blockSizeBytes.orNull)
      .enableDictionaryCompression(enableDictionaryCompression.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
