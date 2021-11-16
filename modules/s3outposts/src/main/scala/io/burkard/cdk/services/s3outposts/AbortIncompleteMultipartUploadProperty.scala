package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AbortIncompleteMultipartUploadProperty {

  def apply(
    daysAfterInitiation: Number
  ): software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty =
    (new software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder)
      .daysAfterInitiation(daysAfterInitiation)
      .build()
}
