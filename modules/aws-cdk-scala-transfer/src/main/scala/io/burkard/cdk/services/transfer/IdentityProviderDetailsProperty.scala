package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IdentityProviderDetailsProperty {

  def apply(
    invocationRole: Option[String] = None,
    url: Option[String] = None,
    directoryId: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty.Builder)
      .invocationRole(invocationRole.orNull)
      .url(url.orNull)
      .directoryId(directoryId.orNull)
      .build()
}
