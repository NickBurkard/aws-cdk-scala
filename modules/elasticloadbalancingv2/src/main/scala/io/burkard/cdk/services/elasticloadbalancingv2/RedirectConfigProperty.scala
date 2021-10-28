package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RedirectConfigProperty {

  def apply(
    statusCode: Option[String] = None,
    path: Option[String] = None,
    host: Option[String] = None,
    query: Option[String] = None,
    port: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty.Builder)
      .statusCode(statusCode.orNull)
      .path(path.orNull)
      .host(host.orNull)
      .query(query.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .build()
}
