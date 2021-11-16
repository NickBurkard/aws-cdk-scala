package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStaticIpProps {

  def apply(
    staticIpName: String,
    attachedTo: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnStaticIpProps =
    (new software.amazon.awscdk.services.lightsail.CfnStaticIpProps.Builder)
      .staticIpName(staticIpName)
      .attachedTo(attachedTo.orNull)
      .build()
}
