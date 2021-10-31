package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3OutputLocationProperty {

  def apply(
    outputS3KeyPrefix: Option[String] = None,
    outputS3Region: Option[String] = None,
    outputS3BucketName: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty =
    (new software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty.Builder)
      .outputS3KeyPrefix(outputS3KeyPrefix.orNull)
      .outputS3Region(outputS3Region.orNull)
      .outputS3BucketName(outputS3BucketName.orNull)
      .build()
}
