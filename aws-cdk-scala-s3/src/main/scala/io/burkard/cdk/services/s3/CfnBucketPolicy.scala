package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBucketPolicy {

  def apply(
    internalResourceId: String,
    policyDocument: Option[AnyRef] = None,
    bucket: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnBucketPolicy =
    software.amazon.awscdk.services.s3.CfnBucketPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyDocument(policyDocument.orNull)
      .bucket(bucket.orNull)
      .build()
}
