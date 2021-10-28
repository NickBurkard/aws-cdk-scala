package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3LocationProperty {

  def apply(
    key: Option[String] = None,
    roleArn: Option[String] = None,
    bucket: Option[String] = None,
    objectVersion: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder)
      .key(key.orNull)
      .roleArn(roleArn.orNull)
      .bucket(bucket.orNull)
      .objectVersion(objectVersion.orNull)
      .build()
}
