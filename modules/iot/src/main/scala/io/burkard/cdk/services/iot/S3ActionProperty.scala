package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ActionProperty {

  def apply(
    cannedAcl: Option[String] = None,
    key: Option[String] = None,
    roleArn: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder)
      .cannedAcl(cannedAcl.orNull)
      .key(key.orNull)
      .roleArn(roleArn.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
