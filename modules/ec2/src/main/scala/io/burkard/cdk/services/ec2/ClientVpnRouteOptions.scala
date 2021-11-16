package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnRouteOptions {

  def apply(
    cidr: String,
    target: software.amazon.awscdk.services.ec2.ClientVpnRouteTarget,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnRouteOptions =
    (new software.amazon.awscdk.services.ec2.ClientVpnRouteOptions.Builder)
      .cidr(cidr)
      .target(target)
      .description(description.orNull)
      .build()
}
