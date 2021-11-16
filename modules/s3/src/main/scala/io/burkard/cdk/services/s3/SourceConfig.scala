package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfig {

  def apply(
    zipObjectKey: String,
    bucket: software.amazon.awscdk.services.s3.IBucket
  ): software.amazon.awscdk.services.s3.deployment.SourceConfig =
    (new software.amazon.awscdk.services.s3.deployment.SourceConfig.Builder)
      .zipObjectKey(zipObjectKey)
      .bucket(bucket)
      .build()
}
