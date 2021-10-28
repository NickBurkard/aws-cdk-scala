package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomHTTPHeaderProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
