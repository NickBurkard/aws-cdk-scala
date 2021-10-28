package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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