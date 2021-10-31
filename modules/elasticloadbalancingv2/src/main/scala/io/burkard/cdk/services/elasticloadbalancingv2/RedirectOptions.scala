package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedirectOptions {

  def apply(
    path: Option[String] = None,
    host: Option[String] = None,
    query: Option[String] = None,
    permanent: Option[Boolean] = None,
    port: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions.Builder)
      .path(path.orNull)
      .host(host.orNull)
      .query(query.orNull)
      .permanent(permanent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .protocol(protocol.orNull)
      .build()
}
