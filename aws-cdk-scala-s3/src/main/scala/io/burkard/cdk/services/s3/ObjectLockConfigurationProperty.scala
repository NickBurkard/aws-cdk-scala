package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ObjectLockConfigurationProperty {

  def apply(
    objectLockEnabled: Option[String] = None,
    rule: Option[software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty.Builder)
      .objectLockEnabled(objectLockEnabled.orNull)
      .rule(rule.orNull)
      .build()
}
