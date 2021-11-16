package io.burkard.cdk.services.codecommit

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3Property {

  def apply(
    key: String,
    bucket: String,
    objectVersion: Option[String] = None
  ): software.amazon.awscdk.services.codecommit.CfnRepository.S3Property =
    (new software.amazon.awscdk.services.codecommit.CfnRepository.S3Property.Builder)
      .key(key)
      .bucket(bucket)
      .objectVersion(objectVersion.orNull)
      .build()
}
