package io.burkard.cdk.services.fms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceTagProperty {

  def apply(
    key: String,
    value: Option[String] = None
  ): software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty =
    (new software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty.Builder)
      .key(key)
      .value(value.orNull)
      .build()
}
