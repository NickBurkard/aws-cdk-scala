package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessPointTagProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty =
    (new software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
