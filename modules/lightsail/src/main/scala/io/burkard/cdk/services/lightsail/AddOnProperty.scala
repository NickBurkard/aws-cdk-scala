package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddOnProperty {

  def apply(
    addOnType: String,
    autoSnapshotAddOnRequest: Option[software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty.Builder)
      .addOnType(addOnType)
      .autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.orNull)
      .status(status.orNull)
      .build()
}
