package io.burkard.cdk.services.synthetics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeProperty {

  def apply(
    s3Bucket: Option[String] = None,
    script: Option[String] = None,
    s3Key: Option[String] = None,
    handler: Option[String] = None,
    s3ObjectVersion: Option[String] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty.Builder)
      .s3Bucket(s3Bucket.orNull)
      .script(script.orNull)
      .s3Key(s3Key.orNull)
      .handler(handler.orNull)
      .s3ObjectVersion(s3ObjectVersion.orNull)
      .build()
}
