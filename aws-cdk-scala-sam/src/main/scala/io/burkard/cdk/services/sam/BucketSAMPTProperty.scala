package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketSAMPTProperty {

  def apply(
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty.Builder)
      .bucketName(bucketName.orNull)
      .build()
}
