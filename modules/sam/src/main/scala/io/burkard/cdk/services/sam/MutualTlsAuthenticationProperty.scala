package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MutualTlsAuthenticationProperty {

  def apply(
    truststoreVersion: Option[Boolean] = None,
    truststoreUri: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty.Builder)
      .truststoreVersion(truststoreVersion.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .truststoreUri(truststoreUri.orNull)
      .build()
}
