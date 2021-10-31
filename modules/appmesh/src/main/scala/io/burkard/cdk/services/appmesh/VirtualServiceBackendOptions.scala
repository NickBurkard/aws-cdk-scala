package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceBackendOptions {

  def apply(
    tlsClientPolicy: Option[software.amazon.awscdk.services.appmesh.TlsClientPolicy] = None
  ): software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions =
    (new software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions.Builder)
      .tlsClientPolicy(tlsClientPolicy.orNull)
      .build()
}
