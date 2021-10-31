package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleProperty {

  def apply(
    expirationDate: Option[String] = None,
    expirationInDays: Option[Number] = None,
    abortIncompleteMultipartUpload: Option[software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty] = None,
    filter: Option[AnyRef] = None,
    id: Option[String] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty =
    (new software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty.Builder)
      .expirationDate(expirationDate.orNull)
      .expirationInDays(expirationInDays.orNull)
      .abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.orNull)
      .filter(filter.orNull)
      .id(id.orNull)
      .status(status.orNull)
      .build()
}
