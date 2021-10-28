package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AbortIncompleteMultipartUploadProperty {

  def apply(
    daysAfterInitiation: Option[Number] = None
  ): software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty =
    (new software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder)
      .daysAfterInitiation(daysAfterInitiation.orNull)
      .build()
}
