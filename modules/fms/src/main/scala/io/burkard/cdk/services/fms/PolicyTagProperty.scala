package io.burkard.cdk.services.fms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyTagProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty =
    (new software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
