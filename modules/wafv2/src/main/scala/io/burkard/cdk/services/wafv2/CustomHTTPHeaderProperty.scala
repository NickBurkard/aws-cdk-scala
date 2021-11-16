package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomHTTPHeaderProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
