package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStaticIp {

  def apply(
    internalResourceId: String,
    staticIpName: String,
    attachedTo: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lightsail.CfnStaticIp =
    software.amazon.awscdk.services.lightsail.CfnStaticIp.Builder
      .create(stackCtx, internalResourceId)
      .staticIpName(staticIpName)
      .attachedTo(attachedTo.orNull)
      .build()
}
