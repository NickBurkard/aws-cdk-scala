package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MatcherProperty {

  def apply(
    httpCode: Option[String] = None,
    grpcCode: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty.Builder)
      .httpCode(httpCode.orNull)
      .grpcCode(grpcCode.orNull)
      .build()
}
