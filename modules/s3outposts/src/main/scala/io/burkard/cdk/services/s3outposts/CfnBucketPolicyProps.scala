package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBucketPolicyProps {

  def apply(
    policyDocument: AnyRef,
    bucket: String
  ): software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps =
    (new software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps.Builder)
      .policyDocument(policyDocument)
      .bucket(bucket)
      .build()
}
