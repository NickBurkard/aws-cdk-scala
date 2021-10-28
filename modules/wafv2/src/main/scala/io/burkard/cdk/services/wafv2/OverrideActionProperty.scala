package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OverrideActionProperty {

  def apply(
    count: Option[AnyRef] = None,
    none: Option[AnyRef] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty.Builder)
      .count(count.orNull)
      .none(none.orNull)
      .build()
}
