package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddOnProperty {

  def apply(
    autoSnapshotAddOnRequest: Option[software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty] = None,
    status: Option[String] = None,
    addOnType: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty.Builder)
      .autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.orNull)
      .status(status.orNull)
      .addOnType(addOnType.orNull)
      .build()
}
