package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TcpTimeout {

  def apply(
    idle: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.appmesh.TcpTimeout =
    (new software.amazon.awscdk.services.appmesh.TcpTimeout.Builder)
      .idle(idle.orNull)
      .build()
}
