package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OpenIdConnectProviderProps {

  def apply(
    url: String
  ): software.amazon.awscdk.services.eks.OpenIdConnectProviderProps =
    (new software.amazon.awscdk.services.eks.OpenIdConnectProviderProps.Builder)
      .url(url)
      .build()
}
