package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TcpTimeout {

  def apply(
    idle: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.appmesh.TcpTimeout =
    (new software.amazon.awscdk.services.appmesh.TcpTimeout.Builder)
      .idle(idle.orNull)
      .build()
}
