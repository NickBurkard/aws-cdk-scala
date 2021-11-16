package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BucketPolicy {

  def apply(
    internalResourceId: String,
    bucket: software.amazon.awscdk.services.s3.IBucket,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.BucketPolicy =
    software.amazon.awscdk.services.s3.BucketPolicy.Builder
      .create(stackCtx, internalResourceId)
      .bucket(bucket)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
