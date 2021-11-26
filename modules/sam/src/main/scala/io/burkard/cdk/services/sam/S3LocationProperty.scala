package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    key: String,
    version: Number,
    bucket: String
  ): software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty.Builder)
      .key(key)
      .version(version)
      .bucket(bucket)
      .build()
}
