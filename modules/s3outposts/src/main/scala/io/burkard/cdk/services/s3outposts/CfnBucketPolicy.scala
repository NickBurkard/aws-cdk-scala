package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBucketPolicy {

  def apply(
    internalResourceId: String,
    policyDocument: AnyRef,
    bucket: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3outposts.CfnBucketPolicy =
    software.amazon.awscdk.services.s3outposts.CfnBucketPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyDocument(policyDocument)
      .bucket(bucket)
      .build()
}
