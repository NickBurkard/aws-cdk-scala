package io.burkard.cdk.services.fms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyTagProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty =
    (new software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
