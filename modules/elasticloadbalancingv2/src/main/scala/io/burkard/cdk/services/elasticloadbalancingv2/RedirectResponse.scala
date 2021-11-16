package io.burkard.cdk.services.elasticloadbalancingv2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedirectResponse {

  def apply(
    statusCode: String,
    path: Option[String] = None,
    host: Option[String] = None,
    query: Option[String] = None,
    port: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.RedirectResponse =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.RedirectResponse.Builder)
      .statusCode(statusCode)
      .path(path.orNull)
      .host(host.orNull)
      .query(query.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .build()
}
