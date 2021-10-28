package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3LocationProperty {

  def apply(
    key: Option[String] = None,
    version: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty =
    (new software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty.Builder)
      .key(key.orNull)
      .version(version.orNull)
      .bucket(bucket.orNull)
      .build()
}
