package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ActionProperty {

  def apply(
    key: String,
    roleArn: String,
    bucketName: String,
    cannedAcl: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder)
      .key(key)
      .roleArn(roleArn)
      .bucketName(bucketName)
      .cannedAcl(cannedAcl.orNull)
      .build()
}
