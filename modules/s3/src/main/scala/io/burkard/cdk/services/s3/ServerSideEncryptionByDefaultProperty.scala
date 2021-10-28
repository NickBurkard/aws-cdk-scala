package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServerSideEncryptionByDefaultProperty {

  def apply(
    sseAlgorithm: Option[String] = None,
    kmsMasterKeyId: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder)
      .sseAlgorithm(sseAlgorithm.orNull)
      .kmsMasterKeyId(kmsMasterKeyId.orNull)
      .build()
}
