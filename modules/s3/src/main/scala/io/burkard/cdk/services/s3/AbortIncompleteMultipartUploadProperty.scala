package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AbortIncompleteMultipartUploadProperty {

  def apply(
    daysAfterInitiation: Option[Number] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder)
      .daysAfterInitiation(daysAfterInitiation.orNull)
      .build()
}
