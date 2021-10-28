package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicationRuleFilterProperty {

  def apply(
    prefix: Option[String] = None,
    tagFilter: Option[software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty] = None,
    and: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty.Builder)
      .prefix(prefix.orNull)
      .tagFilter(tagFilter.orNull)
      .and(and.orNull)
      .build()
}
