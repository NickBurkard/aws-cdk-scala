package io.burkard.cdk.services.elasticloadbalancingv2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetGroupImportProps {

  def apply(
    targetGroupArn: Option[String] = None,
    defaultPort: Option[String] = None,
    loadBalancerArns: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupImportProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupImportProps.Builder)
      .targetGroupArn(targetGroupArn.orNull)
      .defaultPort(defaultPort.orNull)
      .loadBalancerArns(loadBalancerArns.orNull)
      .build()
}
