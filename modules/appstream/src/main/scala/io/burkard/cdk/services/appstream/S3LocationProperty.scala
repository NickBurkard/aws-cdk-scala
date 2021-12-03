package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    s3Bucket: String,
    s3Key: String
  ): software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty =
    (new software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty.Builder)
      .s3Bucket(s3Bucket)
      .s3Key(s3Key)
      .build()
}
