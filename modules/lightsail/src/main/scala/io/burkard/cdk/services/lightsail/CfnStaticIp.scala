package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStaticIp {

  def apply(
    internalResourceId: String,
    attachedTo: Option[String] = None,
    staticIpName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lightsail.CfnStaticIp =
    software.amazon.awscdk.services.lightsail.CfnStaticIp.Builder
      .create(stackCtx, internalResourceId)
      .attachedTo(attachedTo.orNull)
      .staticIpName(staticIpName.orNull)
      .build()
}
