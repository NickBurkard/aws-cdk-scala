package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBucketPolicy {

  def apply(
    internalResourceId: String,
    policyDocument: AnyRef,
    bucket: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnBucketPolicy =
    software.amazon.awscdk.services.s3.CfnBucketPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyDocument(policyDocument)
      .bucket(bucket)
      .build()
}
