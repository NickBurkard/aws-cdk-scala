package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketPolicyProps {

  def apply(
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.s3.BucketPolicyProps =
    (new software.amazon.awscdk.services.s3.BucketPolicyProps.Builder)
      .bucket(bucket.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
