package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContentProperty {

  def apply(
    s3Bucket: Option[String] = None,
    s3Key: Option[String] = None,
    s3ObjectVersion: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty =
    (new software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder)
      .s3Bucket(s3Bucket.orNull)
      .s3Key(s3Key.orNull)
      .s3ObjectVersion(s3ObjectVersion.orNull)
      .build()
}
