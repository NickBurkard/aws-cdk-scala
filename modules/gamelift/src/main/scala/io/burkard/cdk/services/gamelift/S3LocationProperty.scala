package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    key: String,
    roleArn: String,
    bucket: String,
    objectVersion: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty.Builder)
      .key(key)
      .roleArn(roleArn)
      .bucket(bucket)
      .objectVersion(objectVersion.orNull)
      .build()
}
