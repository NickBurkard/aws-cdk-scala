package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunAsProperty {

  def apply(
    gid: Option[Number] = None,
    uid: Option[Number] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty.Builder)
      .gid(gid.orNull)
      .uid(uid.orNull)
      .build()
}
