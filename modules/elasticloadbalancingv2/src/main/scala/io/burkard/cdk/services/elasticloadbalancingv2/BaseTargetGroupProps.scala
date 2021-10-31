package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseTargetGroupProps {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck] = None,
    deregistrationDelay: Option[software.amazon.awscdk.Duration] = None,
    targetGroupName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    targetType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.TargetType] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps.Builder)
      .healthCheck(healthCheck.orNull)
      .deregistrationDelay(deregistrationDelay.orNull)
      .targetGroupName(targetGroupName.orNull)
      .vpc(vpc.orNull)
      .targetType(targetType.orNull)
      .build()
}
