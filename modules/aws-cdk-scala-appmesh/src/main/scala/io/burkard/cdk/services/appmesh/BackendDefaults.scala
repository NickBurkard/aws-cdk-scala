package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackendDefaults {

  def apply(
    tlsClientPolicy: Option[software.amazon.awscdk.services.appmesh.TlsClientPolicy] = None
  ): software.amazon.awscdk.services.appmesh.BackendDefaults =
    (new software.amazon.awscdk.services.appmesh.BackendDefaults.Builder)
      .tlsClientPolicy(tlsClientPolicy.orNull)
      .build()
}
