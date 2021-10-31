package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnRouteOptions {

  def apply(
    cidr: Option[String] = None,
    description: Option[String] = None,
    target: Option[software.amazon.awscdk.services.ec2.ClientVpnRouteTarget] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnRouteOptions =
    (new software.amazon.awscdk.services.ec2.ClientVpnRouteOptions.Builder)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .target(target.orNull)
      .build()
}
