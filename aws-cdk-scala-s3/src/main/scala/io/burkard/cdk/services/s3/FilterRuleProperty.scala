package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FilterRuleProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
