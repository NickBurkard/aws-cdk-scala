package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContentProperty {

  def apply(
    s3Bucket: String,
    s3Key: String,
    s3ObjectVersion: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty =
    (new software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder)
      .s3Bucket(s3Bucket)
      .s3Key(s3Key)
      .s3ObjectVersion(s3ObjectVersion.orNull)
      .build()
}
