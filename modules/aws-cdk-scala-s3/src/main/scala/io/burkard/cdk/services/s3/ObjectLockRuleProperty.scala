package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ObjectLockRuleProperty {

  def apply(
    defaultRetention: Option[software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty.Builder)
      .defaultRetention(defaultRetention.orNull)
      .build()
}
