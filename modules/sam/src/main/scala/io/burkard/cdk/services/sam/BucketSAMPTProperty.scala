package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BucketSAMPTProperty {

  def apply(
    bucketName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty.Builder)
      .bucketName(bucketName)
      .build()
}
