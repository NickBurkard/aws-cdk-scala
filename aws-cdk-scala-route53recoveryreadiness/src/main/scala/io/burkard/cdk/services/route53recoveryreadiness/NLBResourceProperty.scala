package io.burkard.cdk.services.route53recoveryreadiness

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NLBResourceProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty.Builder)
      .arn(arn.orNull)
      .build()
}
