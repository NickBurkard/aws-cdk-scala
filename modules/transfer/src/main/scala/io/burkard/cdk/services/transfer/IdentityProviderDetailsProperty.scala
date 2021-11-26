package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IdentityProviderDetailsProperty {

  def apply(
    invocationRole: Option[String] = None,
    url: Option[String] = None,
    directoryId: Option[String] = None,
    function: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty.Builder)
      .invocationRole(invocationRole.orNull)
      .url(url.orNull)
      .directoryId(directoryId.orNull)
      .function(function.orNull)
      .build()
}
