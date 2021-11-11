package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStaticIpProps {

  def apply(
    attachedTo: Option[String] = None,
    staticIpName: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnStaticIpProps =
    (new software.amazon.awscdk.services.lightsail.CfnStaticIpProps.Builder)
      .attachedTo(attachedTo.orNull)
      .staticIpName(staticIpName.orNull)
      .build()
}
