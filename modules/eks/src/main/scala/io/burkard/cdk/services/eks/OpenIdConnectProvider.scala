package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OpenIdConnectProvider {

  def apply(
    internalResourceId: String,
    url: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.OpenIdConnectProvider =
    software.amazon.awscdk.services.eks.OpenIdConnectProvider.Builder
      .create(stackCtx, internalResourceId)
      .url(url.orNull)
      .build()
}
