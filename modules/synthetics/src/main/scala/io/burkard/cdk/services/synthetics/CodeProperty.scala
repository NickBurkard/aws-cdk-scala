package io.burkard.cdk.services.synthetics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeProperty {

  def apply(
    handler: String,
    s3Bucket: Option[String] = None,
    script: Option[String] = None,
    s3Key: Option[String] = None,
    s3ObjectVersion: Option[String] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty.Builder)
      .handler(handler)
      .s3Bucket(s3Bucket.orNull)
      .script(script.orNull)
      .s3Key(s3Key.orNull)
      .s3ObjectVersion(s3ObjectVersion.orNull)
      .build()
}
